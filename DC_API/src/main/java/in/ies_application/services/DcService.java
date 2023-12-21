package in.ies_application.services;

import in.ies_application.binding.*;

import java.util.Map;

public interface DcService {

    public Map<Integer, String> getPlans();
    public boolean savePlanSelection(PlanSelection planSelection);
    public boolean saveIncome(Income income);
    public boolean saveEducation(Education education);
    public boolean saveKids(Kids kids);
    public DcSummary fetchSummaryInfo(Long caseNum);
}
