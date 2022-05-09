/**
 * 
 */
package kr.co.ensmart.sample.test;

import java.io.File;

import com.clickntap.vimeo.Vimeo;
import com.clickntap.vimeo.VimeoResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 4. 14.
 *
 */
@Slf4j
public class VimeoTest {
    public static void main(String[] args) throws Exception {
        String token = "7a9d12f706bdbf524690630b8dafd65e";
        Vimeo vimeo = new Vimeo(token); 
        
        //add a video
        boolean upgradeTo1080 = true;
        //String filePath = "C:/Users/choiyh44/Videos/20220120_105516.mp4"; // 커피
        String filePath = "C:/Users/choiyh44/Videos/earphone.mp4"; // earphone
        String videoEndPoint = vimeo.addVideo(new File(filePath), upgradeTo1080);
        log.debug("videoEndPoint: {}", videoEndPoint);
        
        //get video info
        VimeoResponse info = vimeo.getVideoInfo(videoEndPoint);
        log.debug("VimeoResponse: {}", info);
        
        //edit video
        String name = "이어폰";
        String desc = "테스트를 위한 이어폰 동영상입니다.";
        String license = ""; //see Vimeo API Documentation
        String privacyView = ""; //see Vimeo API Documentation
        String privacyEmbed = "whitelist"; //see Vimeo API Documentation
        boolean reviewLink = false;
        info = vimeo.updateVideoMetadata(videoEndPoint, name, desc, license, privacyView, privacyEmbed, reviewLink);
        log.debug("VimeoResponse: {}", info);
        
//        //add video privacy domain
//        vimeo.addVideoPrivacyDomain(videoEndPoint, "fnf");
//       
//        //delete video
//        vimeo.removeVideo(videoEndPoint);
        
      }

}
