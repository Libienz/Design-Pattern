public class LEDMonitor extends AbstractExternalDevice {


    NotebookComputer notebook;

    public LEDMonitor(String deviceType, NotebookComputer notebook) {
        super(deviceType);
        this.notebook = notebook;
    }

    @Override
    public double requiredSpace() {
        return 150;
    }
}
