package kr.co.ensmart.sample.test;

import java.sql.Timestamp;

import javax.xml.bind.DatatypeConverter;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class DatatypeConverterTest {

	@Test
	void test() {
		String value = "20210305";
		Timestamp timestamp =  new Timestamp(DatatypeConverter.parseDateTime(value).getTimeInMillis());
		log.info("result: {}", timestamp);
	}

}
