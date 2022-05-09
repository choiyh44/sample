/**
 * 
 */
package kr.co.ensmart.sample.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2021. 12. 13.
 *
 */
@Slf4j
public class StringBuilderTest {
       public static void main(String...args) {
           StringBuilder sb = new StringBuilder();
           log.info("1: [{}]", sb.append(1).append(2).append(3).toString());

           sb = new StringBuilder();
           log.info("2: [{}]", sb.toString());

           sb = new StringBuilder();
           String str = null;
           sb.append(str);
           log.info("3: [{}]", sb.toString());

           sb = new StringBuilder();
           sb.append(str).append("aaa");
           log.info("3: [{}]", sb.toString());

           sb = new StringBuilder(null);
           log.info("4: [{}]", sb.toString());
       
       }
}
