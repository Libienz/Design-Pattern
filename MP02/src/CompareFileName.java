public class CompareFileName implements Comparable{

    @Override
    public int compareTo(FileInfo o1, FileInfo o2) {
        //o1과 o2 비교 o1이 더크다면 양수 리턴  (문자열 비교중!!)
        //o1과 o2 같으면 0리턴
        //o1보다 o2가 크다면 음수 리턴
        return o1.getName().compareTo(o2.getName());
    }


}
