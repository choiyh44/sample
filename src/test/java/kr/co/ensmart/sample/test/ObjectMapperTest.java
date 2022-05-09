/**
 * 
 */
package kr.co.ensmart.sample.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

import kr.co.ensmart.sample.app.dto.SampleResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 4. 19.
 *
 */
@Slf4j
public class ObjectMapperTest {
    public static void main(String...args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper()
                .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);    
        SampleResponse sampleResponse = new SampleResponse();
        sampleResponse.setCamelName("testname");
        sampleResponse.setTestObjDesc("testObjdesc");
        String json = objectMapper.writeValueAsString(sampleResponse);
        log.info("result: {}", json);
    }
}
