import okhttp3.*;
import java.lang.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * Lesson 6 lecture
 */

public class HttpExample {
    public static void main(String[] args) throws IOException {

        OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://gb.ru")
                .build();

        Response response = okHttpClient.newCall(request).execute();

        System.out.println(response.headers());
        System.out.println(response.body().string());

        /*URL url = new URL("http://gb.ru");

        URLConnection urlConnection = url.openConnection();

        HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;

        System.out.println(urlConnection.getContent());
        System.out.println(((HttpURLConnection) urlConnection).getResponseCode());

        Map<String, List<String>> headers = httpURLConnection.getHeaderFields();
        for (String k: headers.keySet()) {
            System.out.println("Ключ: " + k + ". Значение: " + headers.get(k));
        }*/
    }
}
