public class HardDrive extends AbstractExternalDevice{
    NotebookComputer notebook;

    public HardDrive(String deviceType, NotebookComputer notebook) {
        super(deviceType);
        this.notebook = notebook;
    }

    @Override
    public double requiredSpace() {
        return 40;
    }
}
