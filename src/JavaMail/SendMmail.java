package JavaMail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendMmail
{
    public static void main(String [] args)
    {
        String mailhost = "smtp.gmail.com";
        String from = "ashu.shubhraj@gmail.com", to = "blusp@gmail.com";
        final String user = "ashu.shubhraj@gmail.com", password = "12345678";
        Properties props = new Properties();

        /*props.setProperty("mail.smtp.host", mailhost);
        props.put("mail.smtp.starttls.enable", "true");*/

        props.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(props, new javax.mail.Authenticator()
        {
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(user,password);
            }
        });

        session.setDebug(true);

        try
        {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(from);
            msg.addRecipients(Message.RecipientType.TO, to);
            msg.setSubject("A test mail");
            msg.setText("test message");
            Transport.send(msg);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
