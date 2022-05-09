/**
 * 
 */
package kr.co.ensmart.sample.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2021. 12. 14.
 *
 */
@Slf4j
public class BooleanBitOpTest {
    public static void main(String...args) {
        boolean value = true;
        log.info("1:{}", value);
        
        value ^= value;
        log.info("2:{}", value);
    }
}
