public class CLangPreprocessor implements Preprocessor {


    @Override
    public SourceCode preprocess(SourceCode code) {
        System.out.println("Preprocessing code: " + code.getFilename());
        System.out.println("Generating a new code: preprocessed_" + code.getFilename());

        return new SourceCode("preprocessed_"+ code.getFilename());
    }
}
