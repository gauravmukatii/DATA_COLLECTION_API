package in_ies_application.service;
import in_ies_application.Utilities.EmailUtils;
import in_ies_application.entity.CoNoticeEntity;
import in_ies_application.entity.EligEntity;
import in_ies_application.repo.CoNoticeRepo;
import in_ies_application.repo.EligRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class CoServiceImpl implements CoService {
    @Autowired
    private CoNoticeRepo coNoticeRepo;

    @Autowired
    private EligRepo eligRepo;

    @Autowired
    private EmailUtils emailUtils;

    @Override
    public void processPendingTriggers() {
        List<CoNoticeEntity> records = coNoticeRepo.findByNoticeStatus("P");
        for(CoNoticeEntity entity: records){
            processEachRecord(entity);
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

        return false;
    }

    private String storePdfInS3(File pdfFile){
        return "url";
    }

    private File generateApprovedNotice(EligEntity elig){
        return null;
    }

    private File generateDeniedNotice(EligEntity elig){
        return null;
    }
}
