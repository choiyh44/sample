/**
 * 
 */
package kr.co.ensmart.sample.test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 1. 20.
 *
 */
@Slf4j
class URLTest {

    @Test
    void test() throws MalformedURLException, URISyntaxException {
        String path = "s3://thm-dev-pri-media-contents-s3/media/unsigned/Horizontal/6f9269b9-232f-4cde-aebf-c20300ed897d/sample1/HLS/sample1.m3u8";
        URL url = new URL("http" + path.substring(2));
        log.info("url.getPath(): {}", url.getPath());

        URI uri = new URI(path);
        log.info("uri.getPath(): {}", uri.getPath());

        URL notUrl = new URL(path);
        log.info("notUrl.getPath(): {}", notUrl.getPath());

    }

}
