import java.util.ArrayList;
import java.util.List;

public class IDE implements Builder{

    String projName;
    Preprocessor preprocessor;
    Compiler compiler;
    Linker linker;

    public IDE(Preprocessor preprocessor, Compiler compiler, Linker linker) {
        this.preprocessor = preprocessor;
        this.compiler = compiler;
        this.linker = linker;
    }

    @Override
    public void createProject(String s) {
        projName = s;
    }

    @Override
    public Executable build(SourceCode[] scs) {
        int index = 0;
        ObjectCode[] compiledObj = new ObjectCode[scs.length];
        for (SourceCode sc : scs) {
            ObjectCode obj = compiler.compile((preprocessor.preprocess(sc)));
            compiledObj[index++] = obj;
        }
        return linker.link(this.projName, compiledObj);


    }

    @Override
    public Executable build(List<SourceCode> scs) {
        ArrayList<ObjectCode> compiledObj = new ArrayList<>();
        for (SourceCode sc : scs) {
            ObjectCode obj = compiler.compile((preprocessor.preprocess(sc)));
            compiledObj.add(obj);
        }
        return linker.link(this.projName, compiledObj);

    }
}
