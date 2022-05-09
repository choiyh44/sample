/**
 * 
 */
package kr.co.ensmart.sample.test;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.jupiter.api.Test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 4. 21.
 *
 */
@Slf4j
public class BeanUtilsOfCommonsTest {

    @Test
    void describe() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Object person = new Person("gompang", 1, "Seoul", "010-1234-1234", new Car("현대", "소나타", 2010));

        Map<String,String> desc = BeanUtils.describe(person);
        
        log.info("desc: {}", desc);
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
