package pb2;

public class LinearStrategy implements SearchStrategy{
    @Override
    public boolean doesContainNum(int[] objs, int num) {
        for (int n : objs) {
            if (num == n) return true;
        }
        return false;
    }

}
