public abstract class AbstractExternalDevice extends AbstractNotebookComputer{

    private String deviceType;

    public AbstractExternalDevice(String deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public String toString() {
        return deviceType;
    }
}
