/**
 * 
 */
package kr.co.ensmart.sample.test;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 5. 13.
 *
 */
@Builder
@Getter
@Setter
@ToString
public class SampleWithBuilder extends BaseCommonEntity {
    private Long id;
    private String name;
    private String description;
}
