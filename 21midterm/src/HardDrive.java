public class HardDrive extends AbstractExternalDevice{
    AbstractNotebookComputer notebook;

    public HardDrive(String deviceType, AbstractNotebookComputer notebook) {
        super(deviceType);
        this.notebook = notebook;
    }

    @Override
    public double requiredSpace() {
        return notebook.requiredSpace()+40;
    }
}
