package kr.co.ensmart.sample.test;

import java.time.Duration;
import java.time.Instant;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class DurationTest {

	@Test
	void test() {
		log.debug("Duration.ofSeconds(2): {}", Duration.ofSeconds(2));
		//log.debug("Duration.ofSeconds(2).toSeconds(): {}", Duration.ofSeconds(2).toSeconds());
	}

	@Test
	void testTimeDiff() throws InterruptedException {
	    Instant start = Instant.now();
        //your code
	    Thread.sleep(1500);
	    log.debug("Duration: {}", Duration.between(start, Instant.now()).toMillis());
	}
	
}
