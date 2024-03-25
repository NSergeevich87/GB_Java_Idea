package ru.gb._auto_testing.semi_2.demo.pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb._auto_testing.semi_2.demo.pattern.adapter.JsonAdapter;
import ru.gb._auto_testing.semi_2.demo.pattern.adapter.XMLAdapter;

import java.util.Date;

/**
 * Тест для демонстрации работы паттерна Адаптер
 */
public class AdapterTest {

    @Test
    void jsonTest() {
        //given
        JsonAdapter adapter = new JsonAdapter();
        //when
        //then
        Assertions.assertNotNull(adapter);
    }

    @Test
    void xmlTest() {
        //given
        XMLAdapter adapter = new XMLAdapter();
        //when
        //then
        Assertions.assertNotNull(adapter);
    }
}
