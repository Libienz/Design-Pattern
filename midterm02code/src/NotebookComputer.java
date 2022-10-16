public class NotebookComputer extends AbstractNotebookComputer {

    private String owner;

    @Override
    public String toString() {
        return owner + "'s Notebook computer";
    }

    public NotebookComputer(String owner) {
        this.owner = owner;
    }

    @Override
    public double requiredSpace() {
        return 250;
    }
}
