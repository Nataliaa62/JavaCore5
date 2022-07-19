package dz7.project.classForFiveDay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse5Day {
    @JsonProperty("Headline")
    public Headline headline;
    @JsonProperty("DailyForecasts")
    public ArrayList<DailyForecast> dailyForecasts;

    public WeatherResponse5Day(String string, String string1, String string2, double aDouble) {
    }

    public WeatherResponse5Day() {
    }

    public String toString() {
        return " " + dailyForecasts;

    }
}
