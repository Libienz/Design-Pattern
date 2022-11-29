import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class ImageConverter {
    protected final String HOUSE = "house.png"; // 원본 영상 파일 이름

    public abstract void convert(BufferedImage img);

    public void getConvertedImage() {
        try {
            // 이미지 파일 데이터를 메모리에 넣음
            BufferedImage image = ImageIO.read(new File(HOUSE));
            // 이미지의 각 픽셀 정보에 대해 컬러 변환을 한 후 다시 저장
            convert(image);

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

}
