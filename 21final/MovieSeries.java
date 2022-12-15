import java.lang.reflect.Array;
import java.util.ArrayList;

public class MovieSeries implements LibraryComponent{

    ArrayList<Movie> mvs = new ArrayList<>();
    String sname;
    int year;
    double disc_ratio;

    public MovieSeries(String sname, int year, double disc_ratio) {
        this.sname = sname;
        this.year = year;
        this.disc_ratio = disc_ratio;
    }

    public String getSname() {
        return sname;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(LibraryComponent mvs) {
        MovieSeries cmvs = (MovieSeries) mvs;
        if (cmvs.getSname() == this.sname && cmvs.getYear() == this.year) {
            return true;
        }
        else return false;
    }

    @Override
    public double getPrice() {
        int total = 0;
        for (Movie mv : mvs) {
            total += mv.getPrice();
        }
        return (double) total / this.disc_ratio;
    }

    public Movie getMovie(int idx) {
        return mvs.get(idx);
    }

    public void remove(Movie mv) {
        for (int i = 0; i<mvs.size(); i++) {
            if (mvs.get(i).equals(mv)) {
                mvs.remove(i);
                return;
            }
        }
    }

    public void add(Movie mv) {
        mvs.add(mv);
    }

    public void list() {
        for (Movie mv : mvs) {
            System.out.println(mv.toString());
        }
    }
}
