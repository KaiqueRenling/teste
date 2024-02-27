package br.com.plm.mdm.interactions.PLM;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class EmailSender {



    public static void sendMail() throws Exception {

        String recepient = "andrey.automatizado@gmail.com";

        Properties props = new Properties();

        System.out.println("Preparing to send email");
        String username = "andrey.automatizado@gmail.com";
        String password = "AndreyAutomatizado";
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        Message message = prepareMessage(session, username, recepient);
        Transport.send(message);
        System.out.println("Message sent successfully");
    }

    private static Message prepareMessage(Session session, String email, String recepient) throws Exception {
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Status de Report diario");
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Segue abaixo o reports dos itens criados");

            String filename = "C:/Users/andrey.rodrigues/Desktop/Projeto Ongoing/rennerongoing/test-output/Evidences_11012022210841/ExecutionLogs.txt";
            //filename.setFileName("ExecutionLog");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            return message;
        } catch (Exception e) {
            throw new Exception("bacana, meu amigo");
        }
    }
}



