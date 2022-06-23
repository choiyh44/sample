/**
 * 
 */
package kr.co.ensmart.sample.test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
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
    
    @Test
    void getProperty() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Sample sample = new Sample();
        ((Sample)sample).setId(101L);
        ((Sample)sample).setName("Sample name");
        ((Sample)sample).setDescription("샘플설명");
        
        sample.setSampleDetailList(new ArrayList<>());
        sample.getSampleDetailList().add(SampleDetail.builder().id(1L).detail("상세1").build());
        sample.getSampleDetailList().add(SampleDetail.builder().id(2L).detail("상세2").build());

        Object sample2 = null;

        BeanUtils.getProperty(sample, "name");
        log.info("name: {}", BeanUtils.getProperty(sample, "name"));
        log.info("sysRegMenuId: {}", BeanUtils.getProperty(sample, "sysRegMenuId"));
        log.info("sysRegMenuId: {}", BeanUtils.getProperty(sample2, "sysRegMenuId"));

    }

    @Test
    void copyProperties() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Sample sample = new Sample();
        ((Sample)sample).setId(101L);
        ((Sample)sample).setName("Sample name");
        ((Sample)sample).setDescription("샘플설명");
        sample.setSampleDetail(SampleDetail.builder().id(0L).detail("상세0").build());
        
        sample.setSampleDetailList(new ArrayList<>());
        sample.getSampleDetailList().add(SampleDetail.builder().id(1L).detail("상세1").build());
        sample.getSampleDetailList().add(SampleDetail.builder().id(2L).detail("상세2").build());

        Sample sample2 = new Sample();

        BeanUtils.copyProperties(sample2, sample);
        sample.getSampleDetail().setDetail("상세0-1");
        sample.getSampleDetailList().get(0).setDetail("상세2-1");
        
        log.info("sample: {}", sample);
        log.info("sample2: {}", sample2);

    }
    
    @Test
    void getProperties() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Sample sample = new Sample();
        sample.setId(101L);
        sample.setName("Sample name");
        sample.setDescription("샘플설명");
        
        log.info("sample siteNo: {}", BeanUtils.getProperty(sample, "siteNo"));
        
        BeanUtils.setProperty(sample, "siteNo", 2);
        log.info("sample siteNo: {}", BeanUtils.getProperty(sample, "siteNo"));
    }
    
}
