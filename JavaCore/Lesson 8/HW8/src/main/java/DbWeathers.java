import org.sqlite.JDBC;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbWeathers {
    public final String PATH_DB = "jdbc:sqlite:Z:\\Git\\Learn\\GB\\Java\\JavaCore\\Lesson 8\\HW8\\src\\main\\resources\\Weathers.db";

    Connection connection;

    public DbWeathers() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        connection = DriverManager.getConnection(PATH_DB);
    }

    public void addDailyWeather(DailyWeather dailyWeather) {
        try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO Weather('CITY', 'LOCALDATE', 'WEATHERTEXT', 'TEMPMIN', 'TEMPMAX')" +
                        "VALUES(?, ?, ?, ?, ?)"
        )) { statement.setObject(1, dailyWeather.city);
            statement.setObject(2, dailyWeather.localDate);
            statement.setObject(3, dailyWeather.weatherText);
            statement.setObject(4, dailyWeather.tempMin);
            statement.setObject(5, dailyWeather.tempMax);
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public List<DailyWeather> findAllWeathers() throws SQLException {
        List<DailyWeather> weathers = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Weather");
            while (resultSet.next()) {
                DailyWeather dailyWeather = new DailyWeather();
                dailyWeather.city = resultSet.getString("CITY");
                dailyWeather.localDate = resultSet.getString("LOCALDATE");
                dailyWeather.weatherText = resultSet.getString("WEATHERTEXT");
                dailyWeather.tempMin = resultSet.getDouble("TEMPMIN");
                dailyWeather.tempMax = resultSet.getDouble("TEMPMAX");
                weathers.add(dailyWeather);
            }
        } catch (Exception ignored) {}
        return weathers;
    }

    public List<DailyWeather> findCityWeather(String city) throws SQLException {
        List<DailyWeather> weathers = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Weather WHERE CITY = '"+ city +"'");
            while (resultSet.next()) {
                DailyWeather dailyWeather = new DailyWeather();
                dailyWeather.city = resultSet.getString("CITY");
                dailyWeather.localDate = resultSet.getString("LOCALDATE");
                dailyWeather.weatherText = resultSet.getString("WEATHERTEXT");
                dailyWeather.tempMin = resultSet.getDouble("TEMPMIN");
                dailyWeather.tempMax = resultSet.getDouble("TEMPMAX");
                weathers.add(dailyWeather);
            }
        } catch (Exception ignored) {}
        return weathers;
    }

    public void delWeather(String city) {
        try (PreparedStatement statement = connection.prepareStatement(
                "DELETE FROM Weather WHERE CITY = ?"
        )) { statement.setObject(1, city);
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
