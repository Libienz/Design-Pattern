public class Main {

    public static void main(String[] args) {
        //���� �̹��� ����
        ImageConverter inverseimageConverter = new InverseImageConverter();
        inverseimageConverter.getConvertedImage();
        //���Ǿ��� �̹��� ����
        ImageConverter sepiaImageConverter = new SepiaImageConverter();
        sepiaImageConverter.getConvertedImage();
        //��� �̹��� ����
        ImageConverter greyImageConverter = new GreyImageConverter();
        greyImageConverter.getConvertedImage();
    }
}
