package ru.gb.hw_last_semi;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void test_first_mid_list() {
        FirstMid firstMid = new FirstMid();

        List<Integer> check_list = new ArrayList<>();
        check_list.add(1);
        check_list.add(3);

        double mid_value = firstMid.GetMidOfList(check_list);

        assertEquals(2, mid_value);
    }

    @Test
    public void test_second_mid_list() {
        SecondMid secondMid = new SecondMid();

        List<Integer> check_list = new ArrayList<>();
        check_list.add(3);
        check_list.add(1);

        double mid_value = secondMid.GetMidOfList(check_list);

        assertEquals(2, mid_value);
    }

    @Test
    public void test_mid_comparator() {
        MidComparator midComparator = new MidComparator();

        String result = midComparator.CompareValues(2, 2);
        assertEquals(result, "Средние значения равны");

        result = midComparator.CompareValues(1, 2);
        assertEquals(result, "Второй список имеет большее среднее значение");

        result = midComparator.CompareValues(2, 1);
        assertEquals(result, "Первый список имеет большее среднее значение");
    }
}
