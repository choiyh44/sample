package kr.co.ensmart.sample.base.mail;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

public class MailSenderOld {
	private static final String fromMail = "webmaster@thehandsome.com";
	private static final String fromName = "ksm"; 

	private MailProperties props;
	
	public MailSenderOld(MailProperties props) {
		this.props = props;
	}
	
	public void send(String toMail, String subject, String contents) throws UnsupportedEncodingException, MessagingException {
		// mail properties
		Properties properties = new Properties();
		properties.put("mail.smtp.host", props.getHost());// use Gmail 
		properties.put("mail.smtp.port", props.getPort()); // set port
		Session mailSession = Session.getInstance(properties
				, new javax.mail.Authenticator() { // set authenticator 
					protected PasswordAuthentication getPasswordAuthentication() { 
						return new PasswordAuthentication(props.getUserName(), props.getPassword()); 
					} });

		MimeMessage message = new MimeMessage(mailSession);
		message.setFrom(new InternetAddress(fromMail, MimeUtility.encodeText(fromName, "UTF-8", "B"))); // 한글의 경우 encoding 필요
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toMail));
		message.setSubject(subject);
		message.setContent(contents.toString(), "text/html;charset=UTF-8"); // 내용 설정 (HTML 형식)
		message.setSentDate(new java.util.Date());
		
		try (Transport t = mailSession.getTransport("smtp")) {
			t.connect(props.getUserName(), props.getPassword());
			t.sendMessage(message, message.getAllRecipients());
		}
		
	}
	
}
