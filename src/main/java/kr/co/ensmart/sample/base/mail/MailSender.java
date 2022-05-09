package kr.co.ensmart.sample.base.mail;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

public class MailSender {
	private static final String fromMail = "webmaster@thehandsome.com";
	private static final String fromName = "ksm"; 

	private MailProperties mailProperties;
	
	public MailSender(MailProperties mailProperties) {
		this.mailProperties = mailProperties;
	}

	/**
	 * 작성된 html 컨텐츠를 메일로 전송합니다.
	 * @param toMail
	 * @param subject
	 * @param contents
	 * @throws UnsupportedEncodingException
	 * @throws MessagingException
	 */
	public void send(String toMail, String subject, String contents) throws UnsupportedEncodingException, MessagingException {
		JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost(mailProperties.getHost());
        javaMailSender.setPort(mailProperties.getPort());
        javaMailSender.setUsername(mailProperties.getUserName());
        javaMailSender.setPassword(mailProperties.getPassword());

        InternetAddress from = new InternetAddress(fromMail, fromName);
        InternetAddress to = new InternetAddress(toMail);
        
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, "UTF-8");
        messageHelper.setFrom(from);
        messageHelper.setTo(to);
        messageHelper.setSubject(subject);
        messageHelper.setText(contents, true);

        javaMailSender.send(mimeMessage);
	}	
	
}
