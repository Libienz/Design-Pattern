public class Main {

    public static void main(String[] args) {
        //반전 이미지 생성
        ImageConverter inverseimageConverter = new InverseImageConverter();
        inverseimageConverter.getConvertedImage();
        //세피아톤 이미지 생성
        ImageConverter sepiaImageConverter = new SepiaImageConverter();
        sepiaImageConverter.getConvertedImage();
        //흑백 이미지 생성
        ImageConverter greyImageConverter = new GreyImageConverter();
        greyImageConverter.getConvertedImage();
    }
}
