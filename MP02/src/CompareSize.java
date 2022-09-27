public class CompareSize implements Comparable{

    @Override
    public int compareTo(Object o1, Object o2) {
        //o1과 o2 비교 o1이 더크다면 양수 리턴  (사이즈 비교중!!)
        //o1과 o2 같으면 0리턴
        //o1보다 o2가 크다면 음수 리턴
        FileInfo f1 = (FileInfo) o1;
        FileInfo f2 = (FileInfo) o2;

        return f1.getSize()-f2.getSize();
    }

}
