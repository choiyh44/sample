package kr.co.ensmart.sample.test;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class DurationTest {

	@Test
	void test() {
		log.debug("Duration.ofSeconds(2): {}", Duration.ofSeconds(2));
		//log.debug("Duration.ofSeconds(2).toSeconds(): {}", Duration.ofSeconds(2).toSeconds());
	}

}
