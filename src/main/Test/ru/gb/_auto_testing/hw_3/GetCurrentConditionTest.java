package ru.gb._auto_testing.hw_3;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb._auto_testing.hw_3.autocomplete.Autocomplete;
import ru.gb._auto_testing.hw_3.currentcondition.Temperature;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetCurrentConditionTest extends AccuweatherAbstractTest {
    @Test
    void GetTemperatureTest() {
        //класс Temperature не содердит поле LocalObservationDateTime, которые приходит в JSON
        List<Temperature> response = given()
                .queryParam("apikey", getApiKey())
                .queryParam("q", "Barcelona")
                .when()
                .get(getBaseUrl()+"/currentconditions/v1/50")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(2000l))
                .extract()
                .body().jsonPath().getList(".", Temperature.class);

        Assertions.assertEquals(21, response.get(0).getMetric());
    }
}
