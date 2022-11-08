public class ObjectCode { // 컴파일의 결과물


    String filename;

    @Override
    public String toString() {
        return "ObjectCode{" +
                "filename='" + filename + '\'' +
                '}';
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public ObjectCode(String filename) {
        this.filename = filename;
    }
}
