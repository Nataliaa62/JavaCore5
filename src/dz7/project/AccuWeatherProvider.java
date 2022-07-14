package dz7.project;

import com.fasterxml.jackson.databind.ObjectMapper;
import dz7.project.classForFiveDay.WeatherResponse5Day;
import dz7.project.classForOneDay.WeatherResponse;
import lesson7.project.enums.Periods;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


import java.io.IOException;
import java.util.Arrays;

public class AccuWeatherProvider implements WeatherProvider {

    private static final String BASE_HOST = "dataservice.accuweather.com";            //сайт
    private static final String FORECAST_ENDPOINT = "forecasts";                       //эндпойнт
    private static final String CURRENT_CONDITIONS_ENDPOINT = "currentconditions";
    private static final String API_VERSION = "v1";
    private static final String API_KEY = ApplicationGlobalState.getInstance().getApiKey();   //получить апи из ApplicationGlobalState
    private static final String DAILY = "daily";
    private static final String FIVE_DAY = "5day";


    private final OkHttpClient client = new OkHttpClient();        //создаем соединение
   //ОбъектМаппер класс и как сериализировать java-объекты в JSON и дезериализировать строку JSON в java-объекты.
    private final ObjectMapper objectMapper = new ObjectMapper();
    //позволяет получить результат погоды
    @Override
    public void getWeather(Periods periods) throws IOException {        //Periods periods есть now, 5day
        String cityKey = detectCityKey();
        if (periods.equals(Periods.NOW)) {
            HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(BASE_HOST)
                .addPathSegment(CURRENT_CONDITIONS_ENDPOINT)
                .addPathSegment(API_VERSION)
                .addPathSegment(cityKey)

                .addQueryParameter("apikey", API_KEY)
                .build();

            Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();
//моя часть кода!!!
            Response response = client.newCall(request).execute();
            String jsonString = response.body().string();
            ObjectMapper objectMapper = new ObjectMapper();
            WeatherResponse[]  weatherResponse = objectMapper.readValue(jsonString, WeatherResponse[].class);
            System.out.println(Arrays.toString(weatherResponse));


            // TODO: Сделать в рамках д/з вывод более приятным для пользователя.
            //  Создать класс WeatherResponse, десериализовать ответ сервера в экземпляр класса
            //  Вывести пользователю только текущую температуру в C и сообщение (weather text)

//моя часть кода!!!
        } else if(periods.equals(Periods.FIVE_DAYS)){
            String selectedCity = ApplicationGlobalState.getInstance().getSelectedCity();
               HttpUrl url = new HttpUrl.Builder()
                        .scheme("http")
                        .host(BASE_HOST)
                        .addPathSegment(FORECAST_ENDPOINT)
                        .addPathSegment(API_VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(FIVE_DAY)
                        .addPathSegment(cityKey)
                        .addQueryParameter("apikey", API_KEY)
                        .build();

                Request request = new Request.Builder()
                        .addHeader("accept", "application/json")
                        .url(url)
                        .build();

                Response response = client.newCall(request).execute();

            String jsonString = response.body().string();
            ObjectMapper objectMapper = new ObjectMapper();
            WeatherResponse5Day weatherResponse5Day = objectMapper.readValue(jsonString, WeatherResponse5Day.class);
            System.out.println("В городе " +  selectedCity   + (weatherResponse5Day));
        }
    }

    public String detectCityKey() throws IOException {
        String selectedCity = ApplicationGlobalState.getInstance().getSelectedCity();

        HttpUrl detectLocationURL = new HttpUrl.Builder()
            .scheme("http")
            .host(BASE_HOST)
            .addPathSegment("locations")
            .addPathSegment(API_VERSION)
            .addPathSegment("cities")
            .addPathSegment("autocomplete")
            .addQueryParameter("apikey", API_KEY)
            .addQueryParameter("q", selectedCity)
            .build();

        Request request = new Request.Builder()
            .addHeader("accept", "application/json")
            .url(detectLocationURL)
            .build();

        Response response = client.newCall(request).execute();

        if (!response.isSuccessful()) {
            throw new IOException("Невозможно прочесть информацию о городе. " +
                "Код ответа сервера = " + response.code() + " тело ответа = " + response.body().string());
        }
        String jsonResponse = response.body().string();
        System.out.println("Произвожу поиск города " + selectedCity);

        if (objectMapper.readTree(jsonResponse).size() > 0) {
            String cityName = objectMapper.readTree(jsonResponse).get(0).at("/LocalizedName").asText();
            String countryName = objectMapper.readTree(jsonResponse).get(0).at("/Country/LocalizedName").asText();
            System.out.println("Найден город " + cityName + " в стране " + countryName);
        } else throw new IOException("Server returns 0 cities");

        String s = objectMapper.readTree(jsonResponse).get(0).at("/Key").asText();
        return objectMapper.readTree(jsonResponse).get(0).at("/Key").asText();
    }
}
