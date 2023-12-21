package in.ies_application.services;

import in.ies_application.binding.*;
import in.ies_application.entities.EducationEntity;
import in.ies_application.entities.IncomeEntity;
import in.ies_application.entities.KidsEntity;
import in.ies_application.entities.PlanSelEntity;
import in.ies_application.repos.EducationRepo;
import in.ies_application.repos.IncomeRepo;
import in.ies_application.repos.KidsRepo;
import in.ies_application.repos.PlanSelRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DcServiceImpl implements DcService {
    @Autowired
    private PlanSelRepo planSelRepo;
    @Autowired
    private KidsRepo kidsRepo;
    @Autowired
    private IncomeRepo incomeRepo;
    @Autowired
    private EducationRepo educationRepo;
    @Override
    public Map<Integer, String> getPlans() {
        return null;
    }

    @Override
    public boolean savePlanSelection(PlanSelection planSelection) {

        PlanSelEntity planSelEntity = new PlanSelEntity();
        BeanUtils.copyProperties(planSelection, planSelEntity);
        planSelRepo.save(planSelEntity);

        return true;
    }

    @Override
    public boolean saveIncome(Income income) {

        IncomeEntity incomeEntity = new IncomeEntity();
        BeanUtils.copyProperties(income, incomeEntity);
        incomeRepo.save(incomeEntity);

        return true;
    }

    @Override
    public boolean saveEducation(Education education) {
        EducationEntity educationEntity = new EducationEntity();
        BeanUtils.copyProperties(education, educationEntity);
        educationRepo.save(educationEntity);
        return true;
    }

    @Override
    public boolean saveKids(Kids kids) {
        KidsEntity kidsEntity = new KidsEntity();
        BeanUtils.copyProperties(kids, kidsEntity);
        kidsRepo.save(kidsEntity);
        return true;

    }

    @Override
    public DcSummary fetchSummaryInfo(Long caseNum) {
        return null;
    }
}
