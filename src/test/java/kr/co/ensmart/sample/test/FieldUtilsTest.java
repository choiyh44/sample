/**
 * 
 */
package kr.co.ensmart.sample.test;

import java.lang.reflect.Field;
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
    }

    @Test
    void readDeclaredFieldForceAccess() throws IllegalAccessException {
        Sample sample = new Sample();
        sample.setId(101L);
        sample.setName("샘플명");
        sample.setDescription("샘플설명");
        
        log.info("name: {}", FieldUtils.readDeclaredField(sample, "name", true));
    }

}
