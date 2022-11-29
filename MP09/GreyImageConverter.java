import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

//import java.imageio.*;

// 흑백 영상으로 변환하는 코드
class GreyImageConverter extends ImageConverter {

    @Override
    public void convert(BufferedImage image) {
        for(int y = 0; y < image.getHeight(); y++) {
            for(int x = 0; x < image.getWidth(); x++) {
                // (x, y)에 해당되는 픽셀의 RGB 정보를 받아서 Color에 저장
                Color color = new Color(image.getRGB(x, y));
                // RGB 값을 각각 읽어서 컬러 변환(여기서는 흑백으로 변환)
                int outputRed = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
                int outputGreen = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
                int outputBlue = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
                // 새로 만들어진 RGB 값을 (x, y)좌표 픽셀 컬러로 저장
                image.setRGB(x, y, new Color(outputRed, outputGreen, outputBlue).getRGB());
            }
        }
    }
}