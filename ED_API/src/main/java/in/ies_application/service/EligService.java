package in.ies_application.service;

import in.ies_application.bindings.EdResponse;
import org.springframework.stereotype.Service;

public interface EligService {
    public EdResponse determineEligibility(Long caseNum);
    public boolean generateCo(Long caseNum);
}
