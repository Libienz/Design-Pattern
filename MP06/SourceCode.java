public class SourceCode {
    String filename;

    public SourceCode(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return "SourceCode{" +
                "filename='" + filename + '\'' +
                '}';
    }
}
