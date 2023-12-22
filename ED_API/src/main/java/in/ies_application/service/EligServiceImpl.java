package in.ies_application.service;

import in.ies_application.bindings.EdResponse;
import in.ies_application.entities.*;
import in.ies_application.repos.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

public class EligServiceImpl implements EligService {

    @Autowired
    private PlanSelRepo planSelRepo;
    @Autowired
    private EducationRepo educationRepo;
    @Autowired
    private IncomeRepo incomeRepo;
    @Autowired
    private KidsRepo kidsRepo;
    @Autowired
    private PlanRepo planRepo;
    @Autowired
    private EligRepo eligRepo;
    @Override
    public EdResponse determineEligibility(Long caseNum) {
        EdResponse response = new EdResponse();
        PlanSelEntity planSel = planSelRepo.findByCaseNum(caseNum);
        Integer planId = planSel.getPlanId();

        PlanEntity planEntity = planRepo.findById(planId).get();
        String planName = planEntity.getPlanName();

        IncomeEntity incomeEntity = incomeRepo.findByCaseNum(caseNum);
        EducationEntity educationEntity = educationRepo.findByCaseNum(caseNum);
        List<KidsEntity> kidsEntity = kidsRepo.findByCaseNum(caseNum);

        response.setPlanName(planName);
        response.setCaseNum(caseNum);

        if("SNAP".equals(planName)){
            Double salaryIncome = incomeEntity.getSalaryIncome();
            if(salaryIncome > 300){
                response.setPlanStatus("DN");
                response.setDenielRsn("High Salary Income");
            }else{
                response.setPlanStatus("AP");
                response.setBenefitAmt(350.00);
                response.setEligStartDate(LocalDate.now());
                response.setEligEndDate(LocalDate.now().plusMonths(6));
            }
        }else if("CCAP".equals(planName)){
             Double salaryIncome = incomeEntity.getSalaryIncome();
             Integer kids_count = kidsEntity.size();


        }else if("Medicaid".equals(planName)){

        }else if("Medicare".equals(planName)){

        }else if("RIW".equals(planName)){

        }

        EligEntity eligEntity = new EligEntity();
        BeanUtils.copyProperties(response, eligEntity);
        eligRepo.save(eligEntity);

        return response;
    }

    @Override
    public boolean generateCo(Long caseNum) {
        //get ed record based on caseNum

        //insert into co table

        return false;
    }
}
