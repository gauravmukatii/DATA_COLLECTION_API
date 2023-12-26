package in_ies_application.rest;

import in_ies_application.service.CoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoBatchRestController {
    @Autowired
    private CoService coService;

    @GetMapping("/process")
    public String processTriggers() throws Exception{
        coService.processPendingTriggers();
        return "success";
    }
}
