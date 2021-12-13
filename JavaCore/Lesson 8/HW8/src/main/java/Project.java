import java.lang.*;
import java.io.*;
import java.sql.SQLException;

/**
 * Lesson 8 homework
 */

public class Project {
    public static void main(String[] args) throws IOException, SQLException {

        RequestHandler requestHandler = new RequestHandler();
        DbWeathers dbWeathers = new DbWeathers();

        //requestHandler.detectCityId("Кольчугино");
        requestHandler.detectCityId("Южно-Сахалинск");
        //requestHandler.detectCityId("Калининград");
        DailyWeather dailyWeather = requestHandler.getForecast();
        //System.out.println(dailyWeather);

        dbWeathers.addDailyWeather(dailyWeather);
        System.out.println(dbWeathers.findAllWeathers());
        //System.out.println(dbWeathers.findCityWeather("Kaliningrad"));
        //dbWeathers.delWeather("Yuzhno-Sakhalinsk");
    }
}