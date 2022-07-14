package dz7.project.classForOneDay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import dz7.project.classForOneDay.Temperature;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse{

                @JsonProperty("LocalObservationDateTime")
                public Date localObservationDateTime;
                @JsonProperty("EpochTime")
                public int epochTime;
                @JsonProperty("WeatherText")
                public String weatherText;
                @JsonProperty("WeatherIcon")
                public int weatherIcon;
                @JsonProperty("HasPrecipitation")
                public boolean hasPrecipitation;
                @JsonProperty("PrecipitationType")
                public Object precipitationType;
                @JsonProperty("IsDayTime")
                public boolean isDayTime;
                @JsonProperty("Temperature")
                public Temperature temperature;
                @JsonProperty("MobileLink")
                public String mobileLink;
                @JsonProperty("Link")
                public String link;






        public Date getLocalObservationDateTime() {
                return localObservationDateTime;
        }

        public void setLocalObservationDateTime(Date localObservationDateTime) {
                this.localObservationDateTime = localObservationDateTime;
        }

        public int getEpochTime() {
                return epochTime;
        }

        public void setEpochTime(int epochTime) {
                this.epochTime = epochTime;
        }

        public String getWeatherText() {
                return weatherText;
        }

        public void setWeatherText(String weatherText) {
                this.weatherText = weatherText;
        }

        public int getWeatherIcon() {
                return weatherIcon;
        }

        public void setWeatherIcon(int weatherIcon) {
                this.weatherIcon = weatherIcon;
        }

        public boolean isHasPrecipitation() {
                return hasPrecipitation;
        }

        public void setHasPrecipitation(boolean hasPrecipitation) {
                this.hasPrecipitation = hasPrecipitation;
        }

        public Object getPrecipitationType() {
                return precipitationType;
        }

        public void setPrecipitationType(Object precipitationType) {
                this.precipitationType = precipitationType;
        }

        public boolean isDayTime() {
                return isDayTime;
        }

        public void setDayTime(boolean dayTime) {
                isDayTime = dayTime;
        }

        public Temperature getTemperature() {
                return temperature;
        }

        public void setTemperature(Temperature temperature) {
                this.temperature = temperature;
        }

        public String getMobileLink() {
                return mobileLink;
        }

        public void setMobileLink(String mobileLink) {
                this.mobileLink = mobileLink;
        }

        public String getLink() {
                return link;
        }

        public void setLink(String link) {
                this.link = link;
        }

        @Override
        public String toString() {
                return "Weather today: " + weatherText +   " and " +  getTemperature().getMetric();

        }
        }

