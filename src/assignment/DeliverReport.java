package assignment;


import javax.mail.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class DeliverReport {
	   public static void deliver(String recipiant,String content, final String sender, final String password) 
	    {
	        Properties p = new Properties();

	        
	        p.setProperty("mail.transport.protocol", "smtp");
	        p.setProperty("mail.host", "smtp.gmail.com");	
	        p.put("mail.smtp.auth", "true");
	        p.put("mail.smtp.port", "465");
	        p.put("mail.debug", "true");
	        p.put("mail.smtp.socketFactory.port","465");
	        p.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
	        p.put("mail.smtp.socketFactory.fallback","false");
	        
	        Session s = Session.getDefaultInstance(p,new Authenticator() 
	        {
	            @Override
	            protected PasswordAuthentication getPasswordAuthentication() 
	            {
	                return new PasswordAuthentication(sender, password);
	            }
	        });

	        try 
	        {
	            Message m = new MimeMessage(s);
	            
	            m.setFrom(new InternetAddress(sender));
	            m.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipiant));
	          //  m.setSubject(sub);
	            m.setText(content);

	           //Transport.deliver(m);
	            	            
	       
	        }  catch (MessagingException e) 
	        {
	            JOptionPane.showMessageDialog(null,"ERROR");
	            
	            throw new RuntimeException(e);
	        }  
	    }

	
}
