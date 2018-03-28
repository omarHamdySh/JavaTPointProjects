
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail {

    public static void main(String[] args) {
        String to = "Om_pop2002@yahoo.com";//change accordingly
        String from =  "Omar.h.shafeek@gmail.com";//change accordingly
        String host = "smtp.gmail.com";//or IP address
        String user = from;
        String password = "Write down your password";
        /* Specifies the IP address of your default mail server
     	   for e.g if you are using gmail server as an email sever
           you will pass smtp.gmail.com as value of mail.smtp host. 
           As shown here in the code. 
           Change accordingly, if your email id is not a gmail id
         */
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        //below mentioned mail.smtp.port is optional
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        /* Pass Properties object(props) and Authenticator object   
           for authentication to Session instance 
         */
        //Get the session object
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

        //compose the message
        try {
            MimeMessage message = new MimeMessage(session);
            //You don't have to determine the from attribute because it will be done by
            // the host server in your behave.
            //message.setFrom(from);
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("1st Message from java EE Example");
            message.setText("Eshta 3alek ya 7alawa :D ");

            // Send message
            Transport.send(message);
            System.out.println("message sent successfully....");

        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
