package ru.gb._auto_testing.hw_3;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb._auto_testing.hw_3.getonehour.Getonehour;
import ru.gb._auto_testing.semi_3.seminar.accuweather.weather.DailyForecast;

import static io.restassured.RestAssured.given;

public class GetOneHourTest extends AccuweatherAbstractTest{
    @Test
    void GetOneHourTest() {
        //тут приходит массив, поэтому преобразование должно быть к List<Getonehour> через метод asList
        Getonehour response = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl()+"/forecasts/v1/hourly/1hour/50")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(2000l))
                .extract()
                .response()
                .body().as(Getonehour.class);

        Assertions.assertEquals(false,response.getHasPrecipitation());
    }
}
