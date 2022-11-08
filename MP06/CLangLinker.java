import java.util.List;

public class CLangLinker implements Linker{
    @Override
    public Executable link(String exeFileName, ObjectCode[] objFiles) {
        System.out.println("Linking");
        String res = "";
        for (ObjectCode o : objFiles) {
            res += ("\n" + o.getFilename());
        }
        System.out.println(res);
        return new Executable(exeFileName,res);
    }

    @Override
    public Executable link(String exeFileName, List<ObjectCode> objFiles) {
        System.out.println("Linking");
        String res = "";
        for (ObjectCode o : objFiles) {
            res += ("\n" + o.getFilename());
        }
        System.out.println(res);
        return new Executable(exeFileName,res);
    }
}
