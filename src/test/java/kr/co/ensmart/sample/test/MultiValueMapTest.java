/**
 * 
 */
package kr.co.ensmart.sample.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2021. 12. 9.
 *
 */
@Slf4j
class MultiValueMapTest {

    @Test
    void test() {
        MultiValueMap<String, String> mmap = new LinkedMultiValueMap<>();
        
        mmap.add("key1", "value1");
        mmap.add("key2", "value2");
        mmap.add("key2", "value3");
        log.info("test: {}", mmap);
        
        log.info("test: {}", CollectionUtils.isEmpty(mmap.get("key2")) ? null : mmap.get("key2").toArray());
        log.info("test: {}", CollectionUtils.isEmpty(mmap.get("key3")) ? null : mmap.get("key3").toArray());
    }
    
    @Test
    void testAdd() {
        MultiValueMap<String, String> mmap = new LinkedMultiValueMap<>();
        
        Map<String,String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        mmap.setAll(map);
        log.info("testAdd: {}", mmap);

        map.clear();
        map.put("key3", "value3");
        map.put("key4", "value4");
        mmap.setAll(map);
        log.info("testAdd: {}", mmap);

        map.clear();
        map.put("key3", "value5");
        map.put("key4", "value6");
        mmap.setAll(map);
        log.info("testAdd: {}", mmap);

    }

}
