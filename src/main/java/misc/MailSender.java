package misc;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class MailSender {

    public static void main(String[] args) {
        String hash = BCrypt.hashpw("password", BCrypt.gensalt());
        sendMail("davide2000_09@hotmail.com", "test-mail", hash);
    }
    /*******UTILIZZARE PER INVIARE UNA E-MAIL*******
     * @param to INDIRIZZO E-MAIL DI DESTINAZIONE
     * @param subject OGGETTO DELLA E-MAIL
     * @param text CORPO DELLA E-MAIL*/
    public static void sendMail(String to, String subject, String text) {

        // Recipient's email ID needs to be mentioned.
        String from = "noreply.akkikushi@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.trust", "*");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("noreply.akkikushi@gmail.com", "lvpunrzehsiflslo");
            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject(subject);

            // Now set the actual message
            message.setText(text);

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
