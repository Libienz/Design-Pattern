public class Keyboard extends AbstractExternalDevice{

    //private int space =80;
    NotebookComputer notebook;

    public Keyboard(String deviceType, NotebookComputer notebook) {
        super(deviceType);
        this.notebook = notebook;
    }

    @Override
    public double requiredSpace() {
        return notebook.requiredSpace() + 80;
    }
}
