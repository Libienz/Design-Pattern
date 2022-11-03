import java.util.List;

public interface PasswordDAO {


    public void insert(PasswordInfo passwordInfo);
    public List<PasswordInfo> finaAll();
    public PasswordInfo findByKey(String url);
    public void update(String url, PasswordInfo p);
    public void delete(String url);
    public void delete(PasswordInfo p);



}
