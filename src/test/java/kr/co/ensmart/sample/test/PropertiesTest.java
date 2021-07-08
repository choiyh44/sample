package kr.co.ensmart.sample.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class PropertiesTest {
	@Value("${test.var}")
	private String testVar;
	
	@Test
	void javaRuntimeParamter() {
		log.info("testVar: {}", testVar);
	}

}
