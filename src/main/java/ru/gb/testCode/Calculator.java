package ru.gb.testCode;

public class Calculator {
    public int calculate(char op, int a, int b) {
        // Введите свое решение ниже
        int num1 = a;
        int num2 = b;
        String operation = String.valueOf(op);
        int result = 0;
        switch (operation){
            case "/":
                result = (num1 / num2);
                break;
            case "*":
                result = (num1 * num2);
                break;
            case "-":
                result = (num1 - num2);
                break;
            case "+":
                result = (num1 + num2);
                break;
            default:
                System.out.println("Некорректный оператор: 'оператор'");
        }
        return result;

    }
}
