import java.lang.*;
import java.io.*;

/**
 * Lesson 7 homework
 */

public class Project {
    public static void main(String[] args) throws IOException {
        String cityKey = RequestHandler.detectCityId("Южно-Сахалинск");
        String forecast = RequestHandler.getForecast(cityKey);
        System.out.println(forecast);

    }
}