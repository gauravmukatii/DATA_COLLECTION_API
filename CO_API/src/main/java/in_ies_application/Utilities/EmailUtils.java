package in_ies_application.Utilities;

import jakarta.mail.internet.MimeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class EmailUtils {

    @Autowired
    private JavaMailSender mailSender;
    private Logger logger = LoggerFactory.getLogger(EmailUtils.class);
    public boolean sendEmail(String subject, String body, String to , File file){
        //logic to send email with attachment
        boolean isMailSent = false;
        try{
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
            helper.setTo(to);
            helper.setText(body, true);
            helper.setSubject(subject);
            helper.addAttachment("IES-Elig-Notice", file);
            mailSender.send(mimeMessage);
            isMailSent = true;
        }catch (Exception e){
            logger.error("Exception Occured!", e);
        }

        return isMailSent;
    }
}
