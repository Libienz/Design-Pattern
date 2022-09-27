public class CompareFileType implements Comparable{

    @Override
    public int compareTo(Object o1, Object o2) {
        //o1과 o2 비교 o1이 더크다면 양수 리턴  (문자열 비교중!!)
        //o1과 o2 같으면 0리턴
        //o1보다 o2가 크다면 음수 리턴

        FileInfo f1 = (FileInfo) o1;
        FileInfo f2 = (FileInfo) o2;

        return f1.getType().compareTo(f2.getType());
    }

}
