package ru.gb._auto_testing.hw_6;

import io.qameta.allure.*;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb._auto_testing.hw_6.currentcondition.Currentcondition;
import ru.gb._auto_testing.hw_6.currentcondition.Metric;

import java.util.List;

import static io.restassured.RestAssured.given;

@Epic(value = "Тестирование API https://developer.accuweather.com/apis")
@Feature(value = "Домашняя работа")
public class GetCurrentConditionTest extends AccuweatherAbstractTest {
    @Test
    @Description("GET WeatherText")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Nikita Nikiforov")
    @Story(value = "Тестирование метода getWeatherText")
    void GetWeatherTest() {
        List<Currentcondition> response = given()
                .queryParam("apikey", getApiKey())
                .queryParam("q", "Moscow")
                .when()
                .get(getBaseUrl()+"/currentconditions/v1/50")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(2000l))
                .extract()
                .body().jsonPath().getList(".", Currentcondition.class);

        Assertions.assertEquals("Some clouds", response.get(0).getWeatherText());
    }
}
