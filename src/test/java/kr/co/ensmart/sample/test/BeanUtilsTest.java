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
		Person person = new Person("gompang", 1, "Seoul", "010-1234-1234", new Car("현대", "소나타", 2010));
		Employee employee = new Employee();

		BeanUtils.copyProperties(person, employee);

		log.info("person: {}, employee: {}", person, employee);

		log.info("{person.getCar() == employee.getCar(): {}}", person.getCar() == employee.getCar());
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
    	    private Car car;
    	}
    
    	@Data
    	@AllArgsConstructor
    	@NoArgsConstructor
    	@ToString
    	public static class Employee {
    	    private String name;
    	    private Integer id;
    	    private String address;
    	    private String phone;
    	    private String position;
    	    private Car car;
    	}
    
    	@Data
    	@AllArgsConstructor
    	@NoArgsConstructor
    	@ToString
    	public static class Car {
    		private String company;
    		private String model;
    		private Integer modelYear;
    	}
}
