package tests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
import org.testng.annotations.DataProvider;
//{"City":"Amritsar","Temperature":"101 Degree celsius","Humidity":"197 Percent","Weather Description":"scattered clouds","Wind Speed":"153 Km per hour","Wind Direction degree":"171 Degree"}

public class RestTest {

    @DataProvider(name = "userData")
    public String[] createUserData() {
        return new String[]
                {"Amritsar","Hyderabad","Chennai"};
    }
    @Test(dataProvider = "userData")
    public void rest(String city) {
       given()
                .baseUri("https://demoqa.com/utilities/weather/city")
                .when()
                .get("/"+city)
                .then()
               .statusCode(200)
               .body("City",equalTo(city)).log().all();
        Response response =        given()
                .baseUri("https://demoqa.com/utilities/weather/city")
                .when()
                .get("/"+city);
        String value = response.asString();
        JsonPath jsonPath = new JsonPath(value);
        String cityName = jsonPath.getString("Humidity");
        System.out.println(cityName);
    }

}
