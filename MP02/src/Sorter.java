import java.util.Arrays;
import java.util.Date;

public class Sorter {
    Comparable compare;

    public Sorter(Comparable compare) {
        this.compare = compare;
    }

    public void setComparable(Comparable compare) {
        this.compare = compare;
    }

    /*
    obj[j] 와 obj[j+1]을 비교하는데
    j번째의 값이 j+1번째의 값보다 뒤에 있어야 하면 swap!
     */
    public void bubbleSort(Object[] objs) { // object 클래스로 가능하드아 ..? -> ㅇㅇ 우리에게는 다운캐스팅이 있다.
        for (int i = 0; i < objs.length - 1; i++) {
            for (int j = 0; j < objs.length - i - 1; j++) {
                if (compare.compareTo(objs[j],objs[j+1]) > 0) { // swap
                    Object temp = objs[j];
                    objs[j] = objs[j + 1];
                    objs[j + 1] = temp;
                }
            }
        }
    }





}
