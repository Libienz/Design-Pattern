public class Movie implements LibraryComponent{

    //개별 영화를 나타내는 클래스
    String title;
    int year; //제작연도
    int price;
    String resol;

    public Movie(String title, int year, int price, String resol) {
        this.title = title;
        this.year = year;
        this.price = price;
        this.resol = resol;
    }

    @Override
    public String toString() {
        return "영화: " + this.title + ", 가격: " + price;
    }

    public String getName() {
        return title;
    }

    public int getProductionYear() {
        return year;
    }

    @Override
    public boolean equals(LibraryComponent mv) {

        Movie cmv = (Movie) mv; //casted mv -> cmv
        if (cmv.getName() == this.title && cmv.getProductionYear() == this.year) {
            return true;
        }
        else return false;
    }

    @Override
    public double getPrice() {
        return this.price;
    }


}
