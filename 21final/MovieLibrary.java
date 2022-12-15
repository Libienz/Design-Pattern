import java.util.ArrayList;

public class MovieLibrary {

    ArrayList<LibraryComponent> library = new ArrayList<>();
    String libName;

    public MovieLibrary(String libName) {
        this.libName = libName;
    }

    void delete(LibraryComponent lc) {
        for (int i = 0; i < library.size(); i++) {
            if(library.get(i).equals(lc)) {
                library.remove(i);
                return;
            }
        }
    }
    void insert(LibraryComponent lc, boolean replace) {
        if (replace == true) {

            //기존 것 지우고
            for (int i = 0; i < library.size(); i++) {
                if (library.get(i).equals(lc)) {
                    library.remove(i);
                    library.add(lc);
                    return;
                }

            }

        }

    }

    @Override
    public String toString() {
        double total = 0;
        for (LibraryComponent lc : library) {
            total += lc.getPrice();
        }
        return "라이브러리 이름: " + this.libName + ", 영화 개수 : " + library.size() + ", 전체 영화 가격 : " + total ;
    }
}
