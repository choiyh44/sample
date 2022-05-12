/**
 * 
 */
package kr.co.ensmart.sample.test;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 5. 6.
 *
 */
@Getter
@Setter
@ToString(callSuper=true)
public class Sample extends BaseCommonEntity {
    private Long id;
    @Uppercase
    private String name;
    private String description;
    private SampleDetail sampleDetail;
    private List<SampleDetail> sampleDetailList;
}
