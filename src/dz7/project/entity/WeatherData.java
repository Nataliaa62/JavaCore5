package dz7.project.entity;

public class WeatherData {
//объект который будет сериализоваться и десерелизоваться (
    private int id;
    private String city;
    private String localDate;
    private String text;
    private Float temperature;


    public WeatherData() {
    }

    public WeatherData(int id, String city, String localDate, String text, Float temperature) {
        this.id = id;
        this.city = city;
        this.localDate = localDate;
        this.text = text;
        this.temperature = temperature;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }
}
