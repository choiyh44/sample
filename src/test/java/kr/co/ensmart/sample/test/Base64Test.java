package kr.co.ensmart.sample.test;

import org.apache.tomcat.util.codec.binary.Base64;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Base64Test {
	@Test
	void base64() {
		String encText = "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyTmFtZSI6InRlc3Qgc2VydmljZSIsInJvbGVzIjpbIlJPTEVfU0VSVklDRSJdLCJzdWIiOiJ4MmJlZSBhcGkgdG9rZW4iLCJpc3MiOiJ4MmJlZS5jb20iLCJpYXQiOjE2MjY4NDE4ODQsIm5iZiI6MTYyNjgwNTg4NCwiZXhwIjoxNjI2ODc3ODg0fQ.9u1nVg-92y6HdnRG4Y6sjPEdBICTF-l_XPEQkYiUfHU";
		String decText = new String(Base64.decodeBase64(encText));
		log.info("decText: {}", decText);
	}
}
