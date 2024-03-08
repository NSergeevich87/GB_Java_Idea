package ru.gb.Unit_tests_seminar_3.hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {

    MainHW mainHW = new MainHW();

    @Test
    void evenOddNumber() {
        assertTrue(mainHW.evenOddNumber(2));
        assertFalse(mainHW.evenOddNumber(3));
    }

    @Test
    void inIntervalFalse() {
        // скобки (), значит 25 и 100 не включены в интервал
        assertFalse(mainHW.numberInInterval(25));
        assertFalse(mainHW.numberInInterval(100));
        assertFalse(mainHW.numberInInterval(0));
        assertFalse(mainHW.numberInInterval(200));
    }

    @Test
    void inIntervalTrue() {
        assertTrue(mainHW.numberInInterval(50));
    }
}
