package mail;

import java.util.Properties;
 
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class SendEmail {
        public SendEmail(String contents)
        {
        
        
	//public static void main(String[] args) {
                
		final String username = "compassitessolution@gmail.com";
		final String password = "developer@compass";
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
                
		try {
                        
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("Manish Singh <compassitessolution@gmail.com>"));
                        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("satyam.mgs@gmail.com"));
                        message.setSubject("Mail 1");
			message.setText(contents);
 
			Transport.send(message);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}