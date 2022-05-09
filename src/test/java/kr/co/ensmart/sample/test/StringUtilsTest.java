/**
 * 
 */
package kr.co.ensmart.sample.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 2. 4.
 *
 */
@Slf4j
public class StringUtilsTest {
    @Test
    void substring() {
        log.info(StringUtils.substring("0123456789", 5));
        log.info(StringUtils.substring("0123456789", 0, 5));
        log.info(StringUtils.substring("0123456789", 0, 15));
    }
}
