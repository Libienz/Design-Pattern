import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class ImageConverter {


    //내가 한 것보다 훨씬 겹치는 분 합칠 수 있음 템플릿의 성질 잘 생각하자
    //여튼 겹치지 않는 부분을 추상 메서드로 빼면 된다.
    //나중에 다시 만들어보자
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
