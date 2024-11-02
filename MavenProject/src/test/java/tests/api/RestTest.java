package tests.api;

import api.POJOFiles.ResponsePojo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
import org.testng.annotations.DataProvider;

public class RestTest {

    @DataProvider(name = "userData")
    public String[] createUserData() {
        return new String[]
                {"Amritsar","Hyderabad","Chennai"};
    }
    @Test(dataProvider = "userData")
    public void validateHumidity(String city) {
       given()
                .baseUri("https://demoqa.com/utilities/weather/city")
                .when()
                .get("/"+city)
                .then()
               .statusCode(200)
               .body("City",equalTo(city));//.log().all();
        Response response =        given()
                .baseUri("https://demoqa.com/utilities/weather/city")
                .when()
                .get("/"+city);
        String value = response.asString();
        JsonPath jsonPath = new JsonPath(value);
        String cityName = jsonPath.getString("Humidity");
        System.out.println(cityName);
    }

    @Test
    public void GetWeatherDetails() throws JsonProcessingException {
        RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/Amritsar");
        response.then().log().all();
        String responseBody = response.getBody().asString();
        ObjectMapper mapper = new ObjectMapper();
        ResponsePojo responsePojo = mapper.readValue(responseBody,ResponsePojo.class);
        System.out.println(responsePojo.getWindDirectionDegree());
        String statusLine = response.getStatusLine().toString();
        Assert.assertEquals(statusLine /*actual value*/, "HTTP/1.1 200 OK" /*expected value*/, "Correct status code returned");
    }

}
