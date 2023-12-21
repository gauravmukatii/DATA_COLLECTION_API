package in.ies_application.rest;

import in.ies_application.binding.*;
import in.ies_application.services.DcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class DcRestController {

    @Autowired
    private DcService dcService;

    @GetMapping("/plan-names")
    public Map<Integer, String> getPlans(){
        return dcService.getPlans();
    };

    @PostMapping("/planselection")
    public ResponseEntity<String> savePlanSelection(@RequestBody PlanSelection planSelection){
        boolean status = dcService.savePlanSelection(planSelection);
        if(status){
            return new ResponseEntity<String>("Plan Selection Saved", HttpStatus.OK);
        }
        return new ResponseEntity<String>("Problem Occured", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/income")
    public ResponseEntity<String> saveIncome(@RequestBody Income income){
        boolean status = dcService.saveIncome(income);
        if(status){
            return new ResponseEntity<String>("Income Saved", HttpStatus.OK);
        }
        return new ResponseEntity<String>("Problem Occured", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/education")
    public ResponseEntity<String> saveEducation(@RequestBody Education education){
        boolean status = dcService.saveEducation(education);
        if(status){
            return new ResponseEntity<String>("Education Info Saved", HttpStatus.OK);
        }
        return new ResponseEntity<String>("Problem Occured", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/kids")
    public ResponseEntity<String> saveKids(@RequestBody Kids kids){
        boolean status = dcService.saveKids(kids);
        if(status){
            return new ResponseEntity<String>("Kids Info Saved", HttpStatus.OK);
        }
        return new ResponseEntity<String>("Problem Occured", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/dcsummary/{casenum}")
    public ResponseEntity<DcSummary> getDcSummary(@PathVariable("casenum") Long caseNum){
        DcSummary summaryInfo = dcService.fetchSummaryInfo(caseNum);
        return new ResponseEntity<DcSummary>(summaryInfo, HttpStatus.OK);
    }

}
