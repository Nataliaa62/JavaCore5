package dz7.project;





import dz7.project.enums.Periods;

import java.io.IOException;
import java.sql.SQLException;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException, SQLException;
    void readWeatherDayFromDB(String selectedCity) throws IOException, SQLException;



}
