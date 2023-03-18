import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        //selectDemo();
        //insertDemo();
        //updateDemo();
        //deleteDemo();

    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select title,description,release_year from film");

            List<Film> films = new ArrayList<Film>();

            while (resultSet.next()) {
                films.add(new Film(resultSet.getString("title"), resultSet.getString("description"), resultSet.getInt("release_year")));
            }

            for (Film film : films) {
                System.out.println(film.getTitle() + "\n" + film.getDescription() + "\n" + film.getRelease_year() + "\n");
            }

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }

    public static void insertDemo() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;

        try {
            connection = dbHelper.getConnection();
            String sql = "insert into actor (first_name,last_name) values(?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Morgan");
            statement.setString(2, "Freeman");
            statement.executeUpdate();

            System.out.println("Successful");

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }

    }

    public static void updateDemo() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;

        try {
            connection = dbHelper.getConnection();
            String sql = "update actor set first_name = 'EMMA',last_name = 'WATSON' where actor_id = 204;";
            statement = connection.prepareStatement(sql);
            statement.executeUpdate();

            System.out.println("Successful");

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void deleteDemo() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;

        try {
            connection = dbHelper.getConnection();
            String sql = "delete from actor where actor_id = 204;";
            statement = connection.prepareStatement(sql);
            statement.executeUpdate();

            System.out.println("Successful");

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
}
