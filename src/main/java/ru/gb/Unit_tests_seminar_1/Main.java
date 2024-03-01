package ru.gb.Unit_tests_seminar_1;

import ru.gb.testCode.PlayerMagician;
import ru.gb.testCode.PlayerMagicianComparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Seminar_1");

        assertConditionA();
    }

    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert  weekends.length == 3;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }
}
