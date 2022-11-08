public class CLangCompiler implements Compiler {

    public String getRidOfExtension(String s) {
        String res = "";
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) != '.') {
                res += s.charAt(i);
            }
            else {
                return res;
            }
        }
        return null;
    }
    @Override
    public ObjectCode compile(SourceCode sc) {
        System.out.println("Compiling code: " + sc.getFilename());
        String name = getRidOfExtension(sc.getFilename());
        System.out.println("Generating object code: " + name + ".obj");
        return new ObjectCode(name + ".obj");
    }
}
