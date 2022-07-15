/**
 * 
 */
package kr.co.ensmart.sample.util;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 7. 8.
 *
 */
@Slf4j
public class PasswordGenerator {
    @Test
    public void uuidString() {
        // String result = StringUtils.replace(UUID.randomUUID().toString(), "-", "");
        String result = RandomStringUtils.randomAlphanumeric(30);
        
        log.debug("result: {}", result);
    }
}
