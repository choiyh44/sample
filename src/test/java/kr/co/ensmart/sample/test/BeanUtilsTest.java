package kr.co.ensmart.sample.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class BeanUtilsTest {

	@Test
	void test() {
		Person person1 = new Person("gompang", 1, "Seoul", "010-1234-1234");
		Person person2 = new Person();
		
		BeanUtils.copyProperties(person1, person2);
		
		log.info("person1: {}, person2: {}", person1, person2);
	}

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@ToString
	public static class Person {
	    private String name;
	    private Integer id;
	    private String address;
	    private String phone;
	}
}
