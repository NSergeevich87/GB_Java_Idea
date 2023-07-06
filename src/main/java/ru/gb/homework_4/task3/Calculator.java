package ru.gb.homework_4.task3;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    public static Stack<String> history = new Stack<>();

    public static void main(String[] args) {
        boolean stop = false;
        System.out.println("Добро пожаловать в мой фантастический калькулятор!");
        System.out.println("Просьба все данные вводить корректно, в данной версии исключения не обработаны.");
        System.out.println("Вводите последовательно число -> операция -> число!");
        System.out.println("Если ошиблись, введите 'b' для отмены операции.");
        System.out.println("Введите 'print' для вывода истории.");
        System.out.println("Введите '=' для отображения результата и выхода из приложения.");
        while (!stop) {
            System.out.println();
            System.out.println("'b' для отмены операции, 'print' - история, '=' - результат");

            System.out.print("Введите строку: ");
            String answer = scanner.nextLine();

            switch (answer) {
                case "b":
                    history.remove(history.peek());
                    break;
                case "print":
                    PrintArr(history);
                    break;
                case "=":
                    stop = true;
                    break;
            }
            if (!answer.equals("=") && !answer.equals("print") && !answer.equals("b")) {
                history.push(answer);
            }
        }

        Double num2 = Double.valueOf(history.peek());
        String oper = history.get(history.size() - 2);
        Double num1 = Double.valueOf(history.get(history.size() - 3));
        Double result = 0.0;
        switch (oper) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        System.out.println("История ваших операций: ");
        PrintArr(history);
        System.out.println();
        System.out.print("Результат ваших операций: ");
        System.out.println(result);
    }
    public static void PrintArr (Stack n){
        for (int i = 0; i < n.size(); i++) {
            System.out.print(n.get(i));
            System.out.print(" ");
        }
    }
}
