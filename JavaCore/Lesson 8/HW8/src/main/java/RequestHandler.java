import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class RequestHandler {
    String cityKey;
    String city;
    final static OkHttpClient okHttpClient = new OkHttpClient();
    final static ObjectMapper objectMapper = new ObjectMapper();
    final static String host = "dataservice.accuweather.com";
    //final static String apiKey = "7G3Gwr897QIjAKRAhBWoMOrNYURwr1Aj";
    //final static String apiKey = "Z1VB5jhuuHMDMYx78rVap35rDiG0fNsb";
    final static String apiKey = "hqotDLpOnAXPpgCFPjc2DIm06bK2SH5x ";

    public void detectCityId(String cityName) throws IOException {
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
        cityKey = objectMapper.readTree(json).get(0).at("/Key").asText();
    }

    public DailyWeather getForecast() throws IOException {
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

        DailyWeather dailyWeather = new DailyWeather();
        dailyWeather.weatherText = objectMapper.readTree(json).at("/Headline/Text").asText();
        dailyWeather.city = city;

        JsonNode forecasts = objectMapper.readTree(json);
        JsonNode dailyForecasts = forecasts.path("DailyForecasts");
        for (JsonNode dailyForecast : dailyForecasts){
            dailyWeather.localDate = dailyForecast.get("Date").asText();
            dailyWeather.tempMin = dailyForecast.get("Temperature").get("Minimum").get("Value").asDouble();
            dailyWeather.tempMax = dailyForecast.get("Temperature").get("Maximum").get("Value").asDouble();
        }
        return dailyWeather;
    }
}