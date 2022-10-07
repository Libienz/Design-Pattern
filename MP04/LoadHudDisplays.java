import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface {

    String filename;

    public LoadHudDisplays(String filename) {
        this.filename = filename;
    }

    @Override
    public ArrayList<String> load() {
        ArrayList<String> display_list = new ArrayList<>();


        try {
            BufferedReader readme = new BufferedReader(new FileReader(filename));
            String line = null;
            while ((line = readme.readLine()) != null ) {
                display_list.add(line);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }





        return display_list;
    }
}
