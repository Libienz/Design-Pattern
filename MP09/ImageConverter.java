import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class ImageConverter {
    protected final String HOUSE = "house.png"; // ���� ���� ���� �̸�

    public abstract void convert(BufferedImage img);

    public void getConvertedImage() {
        try {
            // �̹��� ���� �����͸� �޸𸮿� ����
            BufferedImage image = ImageIO.read(new File(HOUSE));
            // �̹����� �� �ȼ� ������ ���� �÷� ��ȯ�� �� �� �ٽ� ����
            convert(image);

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

}
