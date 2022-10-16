package pb2;

public class Main {
    public static void main(String[] args) {
        final int MIN = 11;
        final int MAX = 110;
        final int NUMS = 50;
        IntArrays intArrays = new IntArrays(MIN, MAX, NUMS);

        SearchStrategy b_search = new BinaryStrategy();
        BinaryStrategy l_search = new BinaryStrategy();
        int[] randints = intArrays.getNumbers();
        System.out.println(l_search.doesContainNum(randints, randints[NUMS - 10]));
        System.out.println(l_search.doesContainNum(randints, randints[NUMS - 20]));
        System.out.println(l_search.doesContainNum(randints, MAX + 10));
        System.out.println(l_search.doesContainNum(randints, MIN - 10));
        System.out.println(b_search.doesContainNum(randints, randints[NUMS - 10]));
        System.out.println(b_search.doesContainNum(randints, randints[NUMS - 20]));
        System.out.println(b_search.doesContainNum(randints, MAX + 10));
        System.out.println(b_search.doesContainNum(randints, MIN - 10));
    }
}
