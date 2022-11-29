import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class ImageConverter {
    private final String HOUSE = "house.png"; // 원본 영상 파일 이름

    public abstract void convert(BufferedImage img);

    public void getConvertedImage() {
        try {
            // 이미지 파일 데이터를 메모리에 넣음
            BufferedImage image = ImageIO.read(new File(HOUSE));
            // 이미지의 각 픽셀 정보에 대해 컬러 변환을 한 후 다시 저장

            convert(image);
            // 이미지 파일을 png 파일 형식으로 저장
            // 파일 이름은 HOUSE(house.png)에 "g_"를 앞에 붙인 것으로 지정
            ImageIO.write(image, "png", new File("g_" + HOUSE));
        } catch (
                IOException e) {
            e.printStackTrace();

        }
    }
    // 전체적인 이미지 파일 입출력 과정에서 IOException이 발생할 수 있어 예외 처리 코드를 넣음

}
