import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConcreteDAO implements PasswordDAO {

    final static String DB_FILE_NAME = "pw.db";
    final static String DB_TABLE_NAME = "pws";

    Connection connection = null;
    ResultSet rs = null; //result set -> 한행이라고 표현 했지만 연산결과에서 나온 릴레이션의 부분집합 인 듯
    Statement statement = null;

    public ConcreteDAO() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:" + DB_FILE_NAME);
            statement = connection.createStatement();
            statement.setQueryTimeout(30);
            final String table = " (url text PRIMARY KEY, id text, password text)";

            statement.executeUpdate("DROP TABLE IF EXISTS " + DB_TABLE_NAME);
            statement.executeUpdate("CREATE TABLE " + DB_TABLE_NAME + table);
            System.out.println("db created ,connect, table setting done");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insert(PasswordInfo passwordInfo) {
        try {
            String fmt = "INSERT INTO %s VALUES('%s', '%s', '%s')";
            String q = String.format(fmt, DB_TABLE_NAME, passwordInfo.getUrl(), passwordInfo.getId(), passwordInfo.getPassword());

            statement.execute(q);

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    @Override
    public List<PasswordInfo> finaAll() {
        ArrayList<PasswordInfo> pwInfos = new ArrayList<>();
        try {
            rs = statement.executeQuery("SELECT * FROM " + DB_TABLE_NAME);
            while (rs.next()) {
                pwInfos.add(new PasswordInfo(rs.getString("url"), rs.getString("id"), rs.getString("password")));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pwInfos;
    }


    @Override
    public PasswordInfo findByKey(String url) {
        PasswordInfo pw = null;

        try {
            String fmt = "SELECT * FROM %s WHERE url = %s";
            String q = String.format(fmt, DB_TABLE_NAME, url);
            rs = statement.executeQuery(q); //rs 반환하면 executeQuery 반환 안하면 execute인듯
            if (rs.next()) { //있으면
                pw = new PasswordInfo(rs.getString("url"), rs.getString("id"), rs.getString("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pw;
    }

    @Override
    public void update(String url, PasswordInfo p) {
        try {
            String fmt = "UPDATE %s SET id = '%s', password = '%s' WHERE url = '%s'";
            String q = String.format(fmt, DB_TABLE_NAME, p.getId(), p.getPassword(), url);
            statement.execute(q);
        }
        catch (SQLException e) {
            e.printStackTrace();

        }


    }

    @Override
    public void delete(String url) {

        try {
            String fmt = "DELETE FROM %s WHERE url = '%s'";
            String q = String.format(fmt, DB_TABLE_NAME, url);
            statement.execute(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(PasswordInfo p) {
        delete(p.getUrl());
    }
}
