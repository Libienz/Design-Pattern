public class Mouse extends AbstractExternalDevice {

    AbstractNotebookComputer notebook;

    public Mouse(String deviceType, AbstractNotebookComputer notebook) {
        super(deviceType);
        this.notebook = notebook;
    }

    @Override
    public double requiredSpace() {
        return notebook.requiredSpace()+30;
    }
}
