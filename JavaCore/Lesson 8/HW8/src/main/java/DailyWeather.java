import java.io.IOException;

public class DailyWeather {

    String city;
    String localDate;
    String weatherText;
    Double tempMin;
    Double tempMax;

    @Override
    public String toString() {
        return "[In the city " + city + " on the date: " + localDate +".\n"
                + weatherText + " is expected, the temperature is: minimum " + tempMin + ", maximum " + tempMax  + ".]\n";
    }
}
