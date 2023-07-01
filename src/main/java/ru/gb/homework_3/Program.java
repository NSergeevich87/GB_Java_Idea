package ru.gb.homework_3;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Stream;

public class Program {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer> numbers = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в мое приложение!");
        boolean stop = false;
        while (stop == false){
            System.out.println("\n");
            DelArr(numbers);
            CreateArr(numbers);
            System.out.print("Это случайные целые числа в нем -> ");
            PrintArr(numbers);
            System.out.println();
            System.out.println("Нажмите -> 1, если хотите удалить в нем все четные числа.");
            System.out.println("Нажмите -> 2, если хотите найти минимальное значение.");
            System.out.println("Нажмите -> 3, если хотите найти максимальное значение.");
            System.out.println("Нажмите -> 4, если хотите найти среднее значение.");
            System.out.println("q -> выход из приложения");
            String answer = scanner.nextLine();
            switch (answer) {
                case "1":
                    DelEvenNum(numbers);
                    break;
                case "2":
                    MinNum(numbers);
                    break;
                case "3":
                    MaxNum(numbers);
                    break;
                case "4":
                    MidNum(numbers);
                    break;
                case "q":
                    stop = true;
                    break;
                default:
                    System.out.println("Введите корректное значение!");
            }
        }
    }
    static void DelArr(ArrayList n){
        numbers.clear();
    }
    static void CreateArr(ArrayList n){
        int size = random.nextInt(1, 21);
        System.out.printf("Длина вашего массива -> %s", size);
        System.out.println();

        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(1, 100));
        }
    }
    static void PrintArr(ArrayList n){
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            System.out.print(" ");
        }
    }
    static void DelEvenNum(ArrayList n){
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    numbers.remove(numbers.get(i));
                }
            }
        }
        System.out.print("Вот ваш новый массив без четных чисел -> ");
        PrintArr(numbers);
    }
    static void MinNum(ArrayList n){
        System.out.print("Минимальное значение -> ");
        System.out.print(Collections.min(numbers));
    }
    static void MaxNum(ArrayList n){
        System.out.print("Максимальное значение -> ");
        System.out.print(Collections.max(numbers));
    }
    static void MidNum(ArrayList n){
        System.out.print("Среднее значение с округлением до двух знаков после запятой -> ");
        Stream<Integer> stream = numbers.stream();
        OptionalDouble average = numbers.stream().mapToInt(e -> e).average();
        if (average.isPresent())
        {
            DecimalFormat df = new DecimalFormat("#.##");
            df.setRoundingMode(RoundingMode.FLOOR);
            String roundOff = df.format(average.getAsDouble());

            System.out.print(roundOff);
        }

    }
}
