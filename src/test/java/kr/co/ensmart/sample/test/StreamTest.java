/**
 * 
 */
package kr.co.ensmart.sample.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 6. 21.
 *
 */
@Slf4j
public class StreamTest {
    @Test
    void streamMap() {
        List<Sample> paramList = new ArrayList<>();
        paramList.add(Sample.builder().id(1L).name("name11").build());
        paramList.add(Sample.builder().id(2L).name("name21").build());
        paramList.add(Sample.builder().id(3L).name("name31").build());

        Long[] paramIdArray = paramList.stream().map(sample -> sample.getId()).collect(Collectors.toList()).toArray(new Long[0]);
        log.debug("sampleIdArray: {}", Arrays.toString(paramIdArray));
    }

    @Test
    void streamFilter() {
        List<Sample> paramList = new ArrayList<>();
        paramList.add(Sample.builder().id(1L).build());
        paramList.add(Sample.builder().id(2L).build());
        paramList.add(Sample.builder().id(3L).build());

        Long[] paramIdArray = paramList.stream().map(param -> param.getId()).collect(Collectors.toList()).toArray(new Long[0]);
        log.debug("paramIdArray: {}", Arrays.toString(paramIdArray));

        List<Sample> sampleList = new ArrayList<>();
        sampleList.add(Sample.builder().id(1L).name("name11").build());
        sampleList.add(Sample.builder().id(1L).name("name12").build());
        sampleList.add(Sample.builder().id(1L).name("name13").build());
        sampleList.add(Sample.builder().id(2L).name("name21").build());
        sampleList.add(Sample.builder().id(2L).name("name22").build());
        sampleList.add(Sample.builder().id(2L).name("name23").build());
        sampleList.add(Sample.builder().id(3L).name("name31").build());
        sampleList.add(Sample.builder().id(3L).name("name32").build());
        sampleList.add(Sample.builder().id(3L).name("name33").build());

        for (Long paramId : paramIdArray) {
            List<Sample> sampleSubList = sampleList.stream().filter(sample -> sample.getId() == paramId).collect(Collectors.toList());
            log.debug("sampleIdArray: {}", sampleSubList);
        }
    }


}
