package ru.gb.Unit_tests_seminar_3.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
   // 3.1.
    private SomeService someService;

    @BeforeEach
    void setUp() { someService = new SomeService(); }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 33})
    void multipleThreeNotFiveReturnsFizz(int n) {
        assertEquals("Fizz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 55})
    void multipleFiveNotThreeReturnsFizz(int n) {
        assertEquals("Buzz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 225, 3375})
    void multipleThereeAndFiveReturnsFizzBuzz(int n) {
        assertEquals("FizzBuzz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 41, 43})
    void notMultipleOfThreeOfFiveReturnsNumber(int n) {
        assertEquals(Integer.toString(n), someService.fizzBuzz(n));
    }

    @Test
    void firstLast6TrueTest() {
        int[] nums1 = new int[]{6, 0, 3, 5};
        int[] nums2 = new int[]{2, 0, 3, 6};
        int[] nums3 = new int[]{6, 0, 3, 6};
        assertEquals(true, someService.firstLast6(nums1));
        assertEquals(true, someService.firstLast6(nums2));
        assertEquals(true, someService.firstLast6(nums3));
    }

    @Test
    void  firstLast6FalseTest() {
        int[] nums = new int[]{5, 6, 3, 1};
        assertEquals(false, someService.firstLast6(nums));
        assertFalse(someService.firstLast6(new int[]{5, 6, 3, 1}));
    }

    @Test
    void insufficientCoverageTest() {
        System.out.println(someService.calculatingDiscount(2000, 10));
        assertThat(someService.calculatingDiscount(2000, 50)).isEqualTo(1000);
        assertThat(someService.calculatingDiscount(2000, 100)).isEqualTo(0);
        assertThat(someService.calculatingDiscount(2000, 0)).isEqualTo(2000);

        assertThatThrownBy(()->
                someService.calculatingDiscount(2000, 110))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");

        assertThatThrownBy(()->
                someService.calculatingDiscount(2000, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");

        assertThatThrownBy(()->
                someService.calculatingDiscount(-2000, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной");
    }

    @Test
    void luckySumTest() {
        assertThat(someService.luckySum(3, 3, 3)).isEqualTo(9);
        assertThat(someService.luckySum(13, 3, 3)).isEqualTo(6);
        assertThat(someService.luckySum(3, 13, 3)).isEqualTo(6);
        assertThat(someService.luckySum(3, 3, 13)).isEqualTo(6);
        assertThat(someService.luckySum(13, 13, 13)).isEqualTo(0);
    }
}