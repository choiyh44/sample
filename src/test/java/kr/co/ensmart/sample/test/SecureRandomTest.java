/**
 * 
 */
package kr.co.ensmart.sample.test;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 5. 6.
 *
 */
@Slf4j
class SecureRandomTest {
    private static final int COUNT = 1000;

    @Test
    void random() {
        Instant start = Instant.now();
        for (int i = 0; i < COUNT; i++) {
            Random random = new Random();
            log.info("{}: {}", i, random.nextInt());
        }
        Instant end = Instant.now();
        System.out.println("Random Time taken: "+ Duration.between(start, end).toMillis() +" milliseconds");
    }

    @Test
    void secureRandom() {
        SecureRandom random = new SecureRandom();
        Instant start = Instant.now();
        for (int i = 0; i < COUNT; i++) {
            log.info("{}: {}", i, random.nextInt());
        }
        Instant end = Instant.now();
        System.out.println("SecureRandom Time taken: "+ Duration.between(start, end).toMillis() +" milliseconds");
    }
    
}
