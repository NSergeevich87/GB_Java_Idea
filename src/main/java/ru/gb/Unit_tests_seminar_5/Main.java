package ru.gb.Unit_tests_seminar_5;

import ru.gb.Unit_tests_seminar_5.number.MaxNumberModule;
import ru.gb.Unit_tests_seminar_5.number.RandomNumberModule;

public class Main {
    public static void main(String[] args) {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        randomNumberModule.setNumbers();
        randomNumberModule.printNumbers();
        Integer maxNum = maxNumberModule.findMax(randomNumberModule.getIntegerList());
        System.out.println("\nMaxNum: " + maxNum);
    }
}
