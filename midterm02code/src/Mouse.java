public class Mouse extends AbstractExternalDevice {

    NotebookComputer notebook;

    public Mouse(String deviceType) {
        super(deviceType);
    }


    @Override
    public double requiredSpace() {
        return 30;
    }
}
