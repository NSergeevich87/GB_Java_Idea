package ru.gb._auto_testing.hw_6;

import io.qameta.allure.*;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb._auto_testing.hw_6.getonehour.Getonehour;

import java.util.List;

import static io.restassured.RestAssured.given;

@Epic(value = "Тестирование API https://developer.accuweather.com/apis")
@Feature(value = "Домашняя работа")
public class GetOneHourTest extends AccuweatherAbstractTest{
    @Test
    @Description("GET HasPrecipitation")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Nikita Nikiforov")
    @Story(value = "Тестирование метода getHasPrecipitation")
    void GetOneHourTest() {
        List<Getonehour> response = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl()+"/forecasts/v1/hourly/1hour/50")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(2000l))
                .extract()
                .response()
                .body().jsonPath().getList(".", Getonehour.class);

        Assertions.assertEquals(false,response.get(0).getHasPrecipitation());
    }
}
