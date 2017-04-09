package JavaMail;

import javax.mail.*;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class MultiBodyPart
{
    public static void main(String args[])
    {
        String to = "narayancoal@gmail.com";
        final String user = "ashu.shubhraj@gmail.com";
        final String password = "123456789";
        String mailHost = "smtp.gmail.com";

        Properties properties = new Properties();
        properties.setProperty("mail.smtp.host",mailHost);
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator()
        {
           protected PasswordAuthentication getPasswordAuthentication()
           {
               return new PasswordAuthentication(user, password);
           }
        });

        try
        {
            MimeMessage msg = new MimeMessage(session);
            msg.addRecipients(Message.RecipientType.TO,to);
            msg.setSubject("Mail with attachment");

            Multipart multipart = new MimeMultipart();

            MimeBodyPart part1 = new MimeBodyPart();
            MimeBodyPart part2 = new MimeBodyPart();

            part1.setText("This mail has an attachment.", "text/plain");

            String filename = "MultiBodyPart.java";

            part2.attachFile(filename);

            multipart.addBodyPart(part1);
            multipart.addBodyPart(part2);

            msg.setContent(multipart);
            Transport.send(msg);

            System.out.println("Message Sent");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
