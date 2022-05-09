package kr.co.ensmart.sample.test;

import java.time.LocalDateTime;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LongRunningApp {
	public static void main(String...args) throws InterruptedException {
		new LongRunningApp().run();
	}
	
	public void run() throws InterruptedException {
		log.info("LongRunningApp start: {}", LocalDateTime.now());
		Thread.sleep(20000);
		log.info("LongRunningApp end: {}", LocalDateTime.now());
		
	}
}
