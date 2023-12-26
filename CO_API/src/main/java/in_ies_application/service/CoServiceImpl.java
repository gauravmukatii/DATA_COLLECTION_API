package in_ies_application.service;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectResult;
import in_ies_application.Utilities.EmailUtils;
import in_ies_application.entity.CoNoticeEntity;
import in_ies_application.entity.EligEntity;
import in_ies_application.repo.CoNoticeRepo;
import in_ies_application.repo.EligRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class CoServiceImpl implements CoService {
    @Autowired
    private CoNoticeRepo coNoticeRepo;

    @Autowired
    private EligRepo eligRepo;

    @Autowired
    private EmailUtils emailUtils;

    @Autowired
    private AmazonS3 s3;

    @Override
    public void processPendingTriggers() {
        List<CoNoticeEntity> records = coNoticeRepo.findByNoticeStatus("P");

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(CoNoticeEntity entity: records){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try{
                        processEachRecord(entity);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });

        }
    }

    private void processEachRecord(CoNoticeEntity coNoticeEntity){
        Long caseNum = coNoticeEntity.getCaseNum();

        //get eligibility data
        EligEntity elig = eligRepo.findByCaseNum(caseNum);
        String planStatus = elig.getPlanStatus();

        File pdfFile = null;

        if("AP".equals(planStatus)){
            pdfFile = generateApprovedNotice(elig);
        }else if ("DN".equals(planStatus)){
            pdfFile = generateDeniedNotice(elig);
        }

        String fileUrl = storePdfInS3(pdfFile);
        boolean isUpdated = updateProcessedRecord(coNoticeEntity, fileUrl);

        if(isUpdated){
            emailUtils.sendEmail("", "", "", pdfFile);
        }
    }

    private boolean updateProcessedRecord(CoNoticeEntity coNoticeEntity, String fileUrl) {

        coNoticeEntity.setNoticeStatus("H");
        coNoticeEntity.setNoticeUrl(fileUrl);

        coNoticeRepo.save(coNoticeEntity);

        return true;
    }

    private String storePdfInS3(File file){
        PutObjectResult putObjectResult = s3.putObject("bucketName", file.getName(), file);
        URL url = s3.getUrl("bucketName", file.getName());
        return url.toExternalForm();
    }

    private File generateApprovedNotice(EligEntity elig){
        return null;
    }

    private File generateDeniedNotice(EligEntity elig){
        return null;
    }
}
