package api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class response {

        @JsonProperty("City")
        String city;
        @JsonProperty("Temperature")
        String temperature;
        @JsonProperty("Humidity")
        String humidity;

        @JsonProperty("Weather Description")
        public void setCity(String city) {
            this.city = city;
        }
    public String getCity() {
        return city;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
    public String getTemperature() {
        return temperature;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
    public String getHumidity() {
        return humidity;
    }
    }
