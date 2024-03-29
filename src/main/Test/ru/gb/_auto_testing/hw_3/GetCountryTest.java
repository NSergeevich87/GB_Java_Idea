package ru.gb._auto_testing.hw_3;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb._auto_testing.hw_3.autocomplete.Autocomplete;
import ru.gb._auto_testing.hw_3.autocomplete.Country;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetCountryTest extends AccuweatherAbstractTest {
    @Test
    void GetLocalizedNameTest() {
        //класс содержит только поля ID и LocalizedName, но полей в ответе больше
        List<Country> response = given()
                .queryParam("apikey", getApiKey())
                .queryParam("q", "Barcelona")
                .when()
                .get(getBaseUrl()+"/locations/v1/cities/autocomplete")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(2000l))
                .extract()
                .body().jsonPath().getList(".", Country.class);

        Assertions.assertEquals("Barcelona", response.get(0).getLocalizedName());
    }
}
