import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class RequestHandler {
    private static String city;
    private static String date;
    private static Double tempMin;
    private static Double tempMax;
    final static OkHttpClient okHttpClient = new OkHttpClient();
    final static ObjectMapper objectMapper = new ObjectMapper();
    final static String host = "dataservice.accuweather.com";
    final static String apiKey = "7G3Gwr897QIjAKRAhBWoMOrNYURwr1Aj";

    public static String detectCityId(String cityName) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host(host)
                .addPathSegment("locations")
                .addPathSegment("v1")
                .addPathSegment("cities")
                .addPathSegment("search")
                .addQueryParameter("apikey", apiKey)
                .addQueryParameter("q", cityName)
                .build();

        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();

        String json = response.body().string();

        city = objectMapper.readTree(json).get(0).at("/EnglishName").asText();
        String key = objectMapper.readTree(json).get(0).at("/Key").asText();

        return key;
    }

    public static String getForecast(String cityKey) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host(host)
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("1day")
                .addPathSegment(cityKey)
                .addQueryParameter("apikey", apiKey)
                .addQueryParameter("metric", "true")
                .build();

        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();

        String json = response.body().string();

        String text = objectMapper.readTree(json).at("/Headline/Text").asText();

        JsonNode forecasts = objectMapper.readTree(json);

        JsonNode dailyForecasts = forecasts.path("DailyForecasts");

        for (JsonNode dailyForecast : dailyForecasts){
            date = dailyForecast.get("Date").asText();
            tempMin = dailyForecast.get("Temperature").get("Minimum").get("Value").asDouble();
            tempMax = dailyForecast.get("Temperature").get("Maximum").get("Value").asDouble();
        }

        return "Weather daily forecast:\nIn the city " + city + " on the date: " + date +".\n"
                + text + " is expected, the temperature is: minimum " + tempMin + ", maximum " + tempMax  + ".";
    }
}