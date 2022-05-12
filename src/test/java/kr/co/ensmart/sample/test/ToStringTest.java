/**
 * 
 */
package kr.co.ensmart.sample.test;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 5. 10.
 *
 */
@Slf4j
public class ToStringTest {
       @Test
       void toStringNullTest() {
           Sample sample = null;
           Object obj = sample;
           
           //log.info("(String)null: {}", (String)obj);
           log.info("String.valueOf(null): {}", String.valueOf(obj));
           //log.info("null.toString(): {}", obj.toString());
       }

       @Test
       void toStringTest() {
           Sample sample = new Sample();
           sample.setName("test name");
           sample.setDescription("test desc");
           Object obj = sample;
           
           //log.info("(String)null: {}", (String)obj);
           log.info("String.valueOf(null): {}", String.valueOf(obj));
           log.info("null.toString(): {}", obj.toString());
       }

}
