package dz7.project;
import dz7.project.enums.Functionality;
import dz7.project.enums.Periods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Controller {

    WeatherProvider weatherProvider = new AccuWeatherProvider();
    Map<Integer, Functionality> variantResult = new HashMap();

    //два вариантв : один или пять дней
    public Controller() {
        variantResult.put(1, Functionality.GET_CURRENT_WEATHER);
        variantResult.put(2, Functionality.GET_WEATHER_IN_NEXT_5_DAYS);
        variantResult.put(3, Functionality.GET_WEATHER_FROM_BD);
    }

    public void onUserInput(String input) throws IOException, SQLException {
        int command = Integer.parseInt(input);
        if (!variantResult.containsKey(command)) {
            throw new IOException("There is no command for command-key " + command);
        }

        switch (variantResult.get(command)) {
            case GET_CURRENT_WEATHER:
                getCurrentWeather();
                break;
            case GET_WEATHER_IN_NEXT_5_DAYS:
                getWeatherIn5Days();
                break;
            case GET_WEATHER_FROM_BD:
                readWeatherOneDayFromDB();
                break;
        }
    }
        // объект weatherProvider, где реализован  getWeather (интерфейс) , который реализуется реализацется AccuWeatherProvider, где
        //хранится инфо о том сайте, где реализован getWeather
        public void getCurrentWeather () throws IOException, SQLException {
            weatherProvider.getWeather(Periods.NOW);
        }

        public void getWeatherIn5Days () throws IOException, SQLException {
            weatherProvider.getWeather(Periods.FIVE_DAYS);
        }

        public void readWeatherOneDayFromDB() throws IOException, SQLException {
            String selectedCity = ApplicationGlobalState.getInstance().getSelectedCity();
            weatherProvider.readWeatherDayFromDB(selectedCity);
        }

    /*public void readWeatherFiveDayFromDB() throws IOException, SQLException {
        String selectedCity = ApplicationGlobalState.getInstance().getSelectedCity();
        weatherProvider.readWeatherFiveDayFromDB(selectedCity);*/

}



