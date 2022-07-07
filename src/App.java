package dz6;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class App {
    public static void main(String[] arg) throws IOException {

        String lat = "54.6269";
        String lon = "39.6916";
// СПОСОБ 1
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.weather.yandex.ru/v2/forecast?" + lat + "&" + lon)
                .get()
                .addHeader("X-Yandex-API-Key", "292a0d24-73e3-49d1-ab3a-522a8bf4b1ea")
                .build();
        // Получение объекта ответа от сервера
        Response response = client.newCall(request).execute();
        // Тело сообщения возвращается методом body объекта Response
        String body = response.body().string();
        System.out.print(body);


// СПОСОБ 2
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://api.weather.yandex.ru/v2/forecast?" + lat + "&" + lon).openConnection();
        httpURLConnection.setRequestProperty("X-Yandex-API-Key", "292a0d24-73e3-49d1-ab3a-522a8bf4b1ea");
        Scanner in = new Scanner((InputStream) httpURLConnection.getContent());
        String result = "";
        while (in.hasNext()) {
            result += in.nextLine();
        }
        System.out.println(result);

       /* ИЛИ
       StringBuilder data = new StringBuilder();
       String result;
        try (BufferedReader inn = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()))) {
            while ((result = inn.readLine()) != null) {
                data.append(result);
                System.out.println(result);
            }
        }*/

    }
}