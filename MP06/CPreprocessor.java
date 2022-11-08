public class CPreprocessor implements Preprocessor {

    String filename;

    public CPreprocessor(String filename) {
        this.filename = filename;
    }


    @Override
    public SourceCode preprocess(SourceCode code) {
        System.out.println("Preprocessing code: " + filename);
        System.out.println("Generating a new code: preprocessed_" + filename);

        return new SourceCode("preprocessed_"+ filename);
    }
}
