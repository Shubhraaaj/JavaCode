package JavaMail;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmailTransport
{
    public static void main(String [] args)
    {
            String host = "smtp.gmail.com";
            String from = "usr.some@gmail.com", to = "usr.some@gmail.com";
            final String user = "usr.some", password = "some.usr";
            Properties props = new Properties();
            Session session = Session.getInstance(props);
            try{
                MimeMessage msg = new MimeMessage(session);
                msg.setFrom(from);
                msg.addRecipients(Message.RecipientType.TO, to);
                msg.setSubject("A test mail");
                msg.setText("test message");
                Transport transport = session.getTransport("smtps");
                transport.connect(host, user, password);
                transport.sendMessage( msg, msg.getAllRecipients());
                transport.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
}