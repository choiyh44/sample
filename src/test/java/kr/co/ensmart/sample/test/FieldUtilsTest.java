/**
 * 
 */
package kr.co.ensmart.sample.test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 5. 6.
 *
 */
@Slf4j
class FieldUtilsTest {

    @Test
    void getAllFieldsList() {
        Sample sample = new Sample();
        sample.setId(101L);
        sample.setName("샘플명");
        sample.setDescription("샘플설명");
        
        List<Field> fields = FieldUtils.getAllFieldsList(Sample.class);
        fields.stream().forEach(field -> log.info(field.getName()));
    }

    @Test
    void readDeclaredField() throws IllegalAccessException {
        Sample sample = new Sample();
        sample.setId(101L);
        sample.setName("샘플명");
        sample.setDescription("샘플설명");
        
        log.info("name: {}", FieldUtils.readDeclaredField(sample, "name"));
        log.info("sysRegMenuId: {}", FieldUtils.readDeclaredField(sample, "sysRegMenuId"));
    }

    @Test
    void readDeclaredFieldForceAccess() throws IllegalAccessException {
        Sample sample = new Sample();
        sample.setId(101L);
        sample.setName("샘플명");
        sample.setDescription("샘플설명");
        
        log.info("name: {}", FieldUtils.readDeclaredField(sample, "name", true));
        // log.info("sysRegMenuId: {}", FieldUtils.readDeclaredField(sample, "sysRegMenuId", true));
    }

    @Test
    void readFieldForceAccess() throws IllegalAccessException {
        Object sample = new Sample();
        ((Sample)sample).setId(101L);
        ((Sample)sample).setName("샘플명");
        ((Sample)sample).setDescription("샘플설명");
        
        log.info("name: {}", FieldUtils.readField(FieldUtils.getField(sample.getClass(), "name", true), sample, true));
        log.info("sysRegMenuId: {}", FieldUtils.readField(FieldUtils.getField(sample.getClass(), "sysRegMenuId", true), sample, true));
    }

    @Test
    void getFieldsListWithAnnotation() {
        Object sample = new Sample();
        ((Sample)sample).setId(101L);
        ((Sample)sample).setName("Sample name");
        ((Sample)sample).setDescription("샘플설명");
        
        List<Field> results = FieldUtils.getFieldsListWithAnnotation(Sample.class, Uppercase.class);
        
        results.stream().forEach(field -> log.info("getFieldsListWithAnnotation(); {}", field.getName()));

        Field[] results2 = FieldUtils.getFieldsWithAnnotation(SecureRandomTest.class, Uppercase.class);
        
        Arrays.stream(results2).forEach(field -> log.info("getFieldsListWithAnnotation(); {}", field.getName()));

    }

}
