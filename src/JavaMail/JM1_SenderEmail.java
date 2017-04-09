package JavaMail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class JM1_SenderEmail
{
    public static void main(String args[])
    {
        String host = "webmail.jusl.ac.in";
        String from = "u_roy@it.jusl.ac.in" , to=from;
        Properties properties = new Properties();
        properties.setProperty("mail.smtp.host",host);
        Session session = Session.getInstance(properties);
        try
        {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(from);
            msg.addRecipients(Message.RecipientType.TO, to);
            msg.setSubject("A Test Email");
            msg.setText("Sent a mail without Authentication");
            Transport.send(msg);
            System.out.println("Sent Message Sucessfully...");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
