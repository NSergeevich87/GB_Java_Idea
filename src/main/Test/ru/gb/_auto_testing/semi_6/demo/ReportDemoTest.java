package ru.gb._auto_testing.semi_6.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class ReportDemoTest {

    @Test
    @RepeatedTest(10)
    void successTest() {
        //given
        //vhen
        //then
        Assertions.assertTrue(true);
    }

    @Test
    @RepeatedTest(20)
    void notSuccessTest() {
        //given
        //vhen
        //then
        Assertions.fail();
    }
}
