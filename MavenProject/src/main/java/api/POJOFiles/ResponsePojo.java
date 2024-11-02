package api.POJOFiles;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "City",
        "Temperature",
        "Humidity",
        "Weather_Description",
        "Wind_Speed",
        "Wind_Direction_degree"
})
public class ResponsePojo {

    @JsonProperty("City")
    private String city;
    @JsonProperty("Temperature")
    private String temperature;
    @JsonProperty("Humidity")
    private String humidity;
    @JsonProperty("Weather Description")
    private String weatherDescription;
    @JsonProperty("Wind Speed")
    private String windSpeed;
    @JsonProperty("Wind Direction degree")
    private String windDirectionDegree;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("Temperature")
    public String getTemperature() {
        return temperature;
    }

    @JsonProperty("Temperature")
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("Humidity")
    public String getHumidity() {
        return humidity;
    }

    @JsonProperty("Humidity")
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("Weather Description")
    public String getWeatherDescription() {
        return weatherDescription;
    }

    @JsonProperty("Weather Description")
    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    @JsonProperty("Wind Speed")
    public String getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("Wind Speed")
    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("Wind Direction degree")
    public String getWindDirectionDegree() {
        return windDirectionDegree;
    }

    @JsonProperty("Wind Direction degree")
    public void setWindDirectionDegree(String windDirectionDegree) {
        this.windDirectionDegree = windDirectionDegree;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}