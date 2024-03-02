package ru.gb.Unit_tests_seminar_1;

import ru.gb.testCode.PlayerMagician;
import ru.gb.testCode.PlayerMagicianComparator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Seminar_1");

        //assertConditionA();
        //assertConditionB();
        //System.out.println(assertConditionC(2_147_483_646, 1));
        //assertConditionD();
    }

    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert  weekends.length == 2;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }

    public static void assertConditionB() {
        int x = -1;
        assert x < 0;
    }

    public static int assertConditionC(int a, int b) {
        long result = (long) a + b;
        assert (result <= Integer.MAX_VALUE && result >= Integer.MIN_VALUE) : "Integer overflow";
        return (int) result;
    }

    public static void assertConditionD() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String currentDateTime = dateFormat.format(calendar.getTime());

        assert currentDateTime.equals("01/01/2023") : "Still 2023 year :(";
        if (currentDateTime.equals("01/01/2024")) {
            System.out.println("Happy new year!");
        }
        else {
            System.out.println("Still 2023 year :(");
        }
    }
}
