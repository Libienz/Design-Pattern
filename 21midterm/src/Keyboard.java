public class Keyboard extends AbstractExternalDevice{

    //private int space =80;
    AbstractNotebookComputer notebook;

    public Keyboard(String deviceType, AbstractNotebookComputer notebook) {
        super(deviceType);
        this.notebook = notebook;
    }

    @Override
    public double requiredSpace() {
        return notebook.requiredSpace() + 80;
    }
}
