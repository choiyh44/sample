package kr.co.ensmart.sample.test;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StaticInheritanceTest extends StaticInheritanceParent {

	@Test
	void test1() {
		log.info("PARENT_VAR_1: {}", StaticInheritanceTest.PARENT_VAR_1);
	}
}
