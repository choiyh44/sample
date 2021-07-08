package kr.co.ensmart.sample.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PasswordEncoderTest {

	@Test
	void test() {
		PasswordEncoder passwordEncoder = passwordEncoder();
		String encPassword = passwordEncoder.encode("admin");
		
		log.info("encPassword: {}", encPassword);
	}

	@Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
	
}
