package ru.gb._auto_testing.hw_6;

import io.qameta.allure.*;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb._auto_testing.hw_6.autocomplete.Autocomplete;

import java.util.List;

import static io.restassured.RestAssured.given;

@Epic(value = "Тестирование API https://developer.accuweather.com/apis")
@Feature(value = "Домашняя работа")
public class GetLocationTest extends AccuweatherAbstractTest {

    @Test
    @Description("GET Type")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Nikita Nikiforov")
    @Story(value = "Тестирование метода getType")
    void getTypeTest() {

        List<Autocomplete> response = given()
                .queryParam("apikey", getApiKey())
                .queryParam("q", "Moscow")
                .when()
                .get(getBaseUrl()+"/locations/v1/cities/autocomplete")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(2000l))
                .extract()
                .body().jsonPath().getList(".", Autocomplete.class);

        Assertions.assertEquals("City", response.get(0).getType());
    }
}
