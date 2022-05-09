/**
 * 
 */
package kr.co.ensmart.sample.test;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import kr.co.ensmart.sample.app.dto.SampleResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 4. 19.
 *
 */
@Slf4j
public class GsonTest {
    public static void main(String...args) {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        SampleResponse sampleResponse = new SampleResponse();
        sampleResponse.setCamelName("testname");
        sampleResponse.setTestObjDesc("testObjdesc");
        String json = gson.toJson(sampleResponse);
        log.info("result: {}", json);
    }
}
