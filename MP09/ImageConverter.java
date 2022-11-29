import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class ImageConverter {
    private final String HOUSE = "house.png"; // ���� ���� ���� �̸�

    public abstract void convert(BufferedImage img);

    public void getConvertedImage() {
        try {
            // �̹��� ���� �����͸� �޸𸮿� ����
            BufferedImage image = ImageIO.read(new File(HOUSE));
            // �̹����� �� �ȼ� ������ ���� �÷� ��ȯ�� �� �� �ٽ� ����

            convert(image);
            // �̹��� ������ png ���� �������� ����
            // ���� �̸��� HOUSE(house.png)�� "g_"�� �տ� ���� ������ ����
            ImageIO.write(image, "png", new File("g_" + HOUSE));
        } catch (
                IOException e) {
            e.printStackTrace();

        }
    }
    // ��ü���� �̹��� ���� ����� �������� IOException�� �߻��� �� �־� ���� ó�� �ڵ带 ����

}
