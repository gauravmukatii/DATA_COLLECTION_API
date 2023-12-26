package in_ies_application.Utilities;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class EmailUtils {

    public boolean sendEmail(String subject, String body, String to , File file){
        //logic to send email with attachment

        return false;
    }
}
