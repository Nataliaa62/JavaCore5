package dz6;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
    public class WeatherResponse{
        private String now;
        private float EpochTime;
        private String WeatherText;
        private float WeatherIcon;

        private boolean HasPrecipitation;
        private String PrecipitationType = null;
        private boolean IsDayTime;
        private String MobileLink;
        private String Link;



        // Getter Methods
        public String getNow() {
            return now;
        }
/*
public float getEpochTime() {
        return EpochTime;
        }

public String getWeatherText() {
        return WeatherText;
        }

public float getWeatherIcon() {
        return WeatherIcon;
        }

public boolean getHasPrecipitation() {
        return HasPrecipitation;
        }

public String getPrecipitationType() {
        return PrecipitationType;
        }

public boolean getIsDayTime() {
        return IsDayTime;
        }



public String getMobileLink() {
        return MobileLink;
        }

public String getLink() {
        return Link;
        }*/

// Setter Methods

        public void setNow(String Now) {
            this.now = Now;
        }
/*
public void setEpochTime(float EpochTime) {
        this.EpochTime = EpochTime;
        }

public void setWeatherText(String WeatherText) {
        this.WeatherText = WeatherText;
        }

public void setWeatherIcon(float WeatherIcon) {
        this.WeatherIcon = WeatherIcon;
        }

public void setHasPrecipitation(boolean HasPrecipitation) {
        this.HasPrecipitation = HasPrecipitation;
        }

public void setPrecipitationType(String PrecipitationType) {
        this.PrecipitationType = PrecipitationType;
        }

public void setIsDayTime(boolean IsDayTime) {
        this.IsDayTime = IsDayTime;
        }



public void setMobileLink(String MobileLink) {
        this.MobileLink = MobileLink;
        }

public void setLink(String Link) {
        this.Link = Link;
        }*/

       /* public WeatherResponse(String localObservationDateTime, float epochTime, String weatherText, float weatherIcon, boolean hasPrecipitation, String precipitationType, boolean isDayTime, String mobileLink, String link) {
                this.LocalObservationDateTime = localObservationDateTime;
                this.EpochTime = epochTime;
                this.WeatherText = weatherText;
                this.WeatherIcon = weatherIcon;
                this.HasPrecipitation = hasPrecipitation;
                this.PrecipitationType = precipitationType;
                this.IsDayTime = isDayTime;

                this.MobileLink = mobileLink;
                this.Link = link;
        }*/

        // public WeatherResponse (){};

        @Override
        public String toString() {
            return "+ employeeId=" + now
                       /* + ", employeeName=" + EpochTime
                        + ", employeeAge=" + WeatherText
                        + ", employeeDesignation=" + HasPrecipitation + PrecipitationType+ IsDayTime+
                        MobileLink + Link*/;
        }
    }



