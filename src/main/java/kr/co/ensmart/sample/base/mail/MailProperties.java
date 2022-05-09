package kr.co.ensmart.sample.base.mail;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailProperties {
	private String host;
	private int port;
	private String userName;
	private String password;
}
