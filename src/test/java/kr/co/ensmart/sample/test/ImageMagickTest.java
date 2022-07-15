/**
 * 
 */
package kr.co.ensmart.sample.test;

import java.io.IOException;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IM4JavaException;
import org.im4java.core.IMOperation;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 6. 30.
 *
 */
public class ImageMagickTest {
    private static final String IMAGE_MAGICK_PATH = "C:\\Program Files\\ImageMagick-7.1.0-Q16-HDRI";

    public static void main(String[] args) {
        ConvertCmd cmd = new ConvertCmd();
        //GraphicsMagickCmd  cmd = new GraphicsMagickCmd("convert");
        cmd.setSearchPath(IMAGE_MAGICK_PATH);

        IMOperation op = new IMOperation();
        op.addImage("C:\\sts-workspace\\sample\\src\\main\\resources\\static\\file\\Flower.HEIC");
        op.addImage("C:\\sts-workspace\\sample\\src\\main\\resources\\static\\file\\Flower.PNG");

        try {
            cmd.run(op);
        } catch (IOException | InterruptedException | IM4JavaException e) {
            e.printStackTrace();
        }

    }

}
