public class LEDMonitor extends AbstractExternalDevice {


    AbstractNotebookComputer notebook;

    public LEDMonitor(String deviceType, AbstractNotebookComputer notebook) {
        super(deviceType);
        this.notebook = notebook;
    }

    @Override
    public double requiredSpace() {
        return notebook.requiredSpace()+150;
    }
}
