/**
 * 
 */
package kr.co.ensmart.sample.test;

import java.util.Date;
import java.util.Random;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2021. 12. 14.
 *
 */
@Slf4j
public class RandomTest {

    @Test
    public void nextInt() {
        Random r = new Random();
        r.setSeed(new Date().getTime());
        
        int rand = r.nextInt(24);

        log.info("{}", rand);  // 첫글자는 대문자, 첫글자부터 특수문자 나오면 안 이쁨

        // 대문자 4개를 임의 발생 
        log.info("{}", (char)(rand+'A'));  // 첫글자는 대문자, 첫글자부터 특수문자 나오면 안 이쁨

        log.info("{}", (char)(rand+65));  // 첫글자는 대문자, 첫글자부터 특수문자 나오면 안 이쁨

    }
}
