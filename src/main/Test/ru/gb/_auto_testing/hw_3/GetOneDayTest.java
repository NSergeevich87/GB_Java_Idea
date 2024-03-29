package ru.gb._auto_testing.hw_3;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb._auto_testing.semi_3.seminar.accuweather.weather.DailyForecast;
import ru.gb._auto_testing.semi_3.seminar.accuweather.weather.Weather;

import static io.restassured.RestAssured.given;

public class GetOneDayTest extends AccuweatherAbstractTest{
    @Test
    void GetDailyForecastTest() {
        DailyForecast response = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl()+"/forecasts/v1/daily/1day/50")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(2000l))
                .extract()
                .response()
                .body().as(DailyForecast.class);

        Assertions.assertEquals(21,response.getTemperature());
    }
}
