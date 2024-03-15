package ru.gb.Unit_tests_seminar_5.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberModule {
    List<Integer> numbers = new ArrayList<>();

    public void setNumbers() {
        List<Integer> temp = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(0, 10);
            numbers.add(randomNumber);
        }
    }

    public void printNumbers() {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

    public List<Integer> getIntegerList() {
        return numbers;
    }

    public int[] generateRandomNumbers(int arraySize) {
        Random random = new Random();
        int[] numbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }
}
