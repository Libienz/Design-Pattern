public class Invoker {
    Command cmd;

    public Command getCmd() {
        return cmd;
    }

    public void setCmd(Command cmd) {
        this.cmd = cmd;
    }

    public void buttonPressed() {
        cmd.execute();
    }
}
