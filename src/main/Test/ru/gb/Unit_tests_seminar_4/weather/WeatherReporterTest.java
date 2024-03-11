package ru.gb.Unit_tests_seminar_4.weather;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.*;

class WeatherReporterTest {

    @Test
    public void testWeatherReporter() {

        WeatherService mockWeatherService = mock(WeatherService.class);

        when(mockWeatherService.getCurrentTemperature()).thenReturn(30);

        WeatherReporter weatherReporter = new WeatherReporter(mockWeatherService);

        String report = weatherReporter.generateReport();

        assertEquals("Текущая температура: 30 градусов.", report);
    }

}