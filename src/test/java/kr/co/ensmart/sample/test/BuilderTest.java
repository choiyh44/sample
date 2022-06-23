/**
 * 
 */
package kr.co.ensmart.sample.test;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 5. 13.
 *
 */
@Slf4j
public class BuilderTest {
    @Test
    void build() {
        SampleWithBuilder sample = SampleWithBuilder.builder()
                .id(1L)
                .name("testname")
                .description("testdescription")
                .build();
        
        log.debug("sample: {}", sample);
        
    }
}
