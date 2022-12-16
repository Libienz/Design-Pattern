import java.util.ArrayList;

public class Group implements Selectable {


    int gNum;
    ArrayList<Selectable> sArr = new ArrayList<>();

    public Group(int gNum) {
        this.gNum = gNum; //그룹 번호
    }

    @Override
    public int getMinBoundsX() {
        return 0;
    }

    @Override
    public int getMinBoundsY() {
        return 0;
    }

    @Override
    public int getMaxBoundsX() {
        return 0;
    }

    @Override
    public int getMaxBoundsY() {
        return 0;
    }

    @Override
    public String getName() {
        return "Group: " + gNum;
    }

    @Override
    public boolean isSelected(int x, int y) {
        return false;
    }

    @Override
    public void print() {
        for (Selectable s : sArr) {
            s.print();
        }

    }
}
