package ru.gb.homework_1;

import java.util.Scanner;

public class program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }
        int result = Calculate(op, a, b);
        System.out.println(result);

//        boolean programStop = false;
//        while (programStop == false){
//            System.out.println("Введите номер задачи 1-4: ");
//            String taskNumber = scanner.nextLine();
//            switch (taskNumber) {
//                case "1":
//                    programStop = task1();
//                    break;
//                case "2":
//                    programStop = task2();
//                    break;
//                case "3":
//                    programStop = task3();
//                    break;
//                case "4":
//                    programStop = task4();
//                    break;
////                default:
////                    System.out.println("Введенное значение не соответствует требуемому!");
//            }
//        }
    }

    static boolean task1(){
        System.out.println("Вы успешно запустили задачу 1");
        System.out.println("Подзадача 1: Вычислить n-ое треугольного число (сумма чисел от 1 до n)\nПодзадача 2: n! (произведение чисел от 1 до n)");
        System.out.println("Введите номер подзадачи: ");
        String num = scanner.nextLine();
        switch (num){
            case "1":
                triangular();
                break;
            case "2":
                factorial();
                break;
            default:
                System.out.println("Введенное значение не соответствует требуемому!");
        }
        System.out.println("Хотите продолжить работать с программой? y/n");
        String ans = scanner.next();
        if (ans.equals("n")){ return true; }
        else return false;
    }

    static boolean triangular(){
        System.out.println("Вы запустили задачу треугольного числа! Введите число N:");
        int num = Math.abs(scanner.nextInt());
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        System.out.println("Треугольное число " + num + " = " + result);
        System.out.println("Хотите продолжить работать с программой? y/n");
        String ans = scanner.next();
        if (ans.equals("n")){ return true; }
        else return false;
    }

    static boolean factorial(){
        System.out.println("Вы запустили задачу факториала! Введите число N:");
        int num = Math.abs(scanner.nextInt());
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Факториал " + num + " = " + result);
        System.out.println("Хотите продолжить работать с программой? y/n");
        String ans = scanner.next();
        if (ans.equals("n")){ return true; }
        else return false;
    }

    static boolean task2(){
        System.out.println("Вы успешно запустили задачу 2");
        System.out.println("Вывести все простые числа от 1 до 1000");
        String answer = "";
        for (int i = 2; i < 1001; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j){
                    answer += i + " ";
                    //System.out.println(i);
                } else if (i % j == 0) {
                    break;
                }
            }
        }
        System.out.println(answer);
        System.out.println("Хотите продолжить работать с программой? y/n");
        String ans = scanner.next();
        if (ans.equals("n")){ return true; }
        else return false;
    }

    static boolean task3(){
        System.out.println("Вы успешно запустили задачу 3\nРеализовать простой калькулятор");

        System.out.println("Введите первое число: ");
        float num1 = scanner.nextFloat();

        System.out.println("Введите /, *, - или + : ");
        String operation = scanner.next();

        System.out.println("Введите второе число: ");
        float num2 = scanner.nextFloat();

        switch (operation){
            case "/":
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            default:
                System.out.println("Введенное значение не соответствует требуемому!");
        }
        System.out.println("Хотите продолжить работать с программой? y/n");
        String ans = scanner.next();
        if (ans.equals("n")){ return true; }
        else return false;
    }

    static boolean task4(){
        System.out.println("Вы успешно запустили задачу 4");
        System.out.println("(дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.\n" +
                "Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.\n" +
                "Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.");
        int questionCounter = 0;
        System.out.println("Введите значение числа q или ?: ");
        String q = scanner.next();
        if (q.equals("?")){ questionCounter += 1; }
        System.out.println("Введите значение числа w или ?: ");
        String w = scanner.next();
        if (w.equals("?")){ questionCounter += 1; }
        System.out.println("Введите значение числа e или ?: ");
        String e = scanner.next();
        if (e.equals("?")){ questionCounter += 1; }
        if (questionCounter > 1){ System.out.println("Вы ввели две или больше неизвестных переменных!"); }
        else{
            if (q.equals("?")){
                float y = Float.parseFloat(w);
                float result = Float.parseFloat(e);
                System.out.println(q + " + " + y + " = " + result);
                float answer = result - y;
                String ans = String.format("%.2f", answer);
                System.out.println(" ?" + " = " + ans);
            }
            else if (w.equals("?")){
                float x = Float.parseFloat(q);
                float result = Float.parseFloat(e);
                System.out.println(x + " + " + w + " = " + result);
                float answer = result - x;
                String ans = String.format("%.2f", answer);
                System.out.println(" ?" + " = " + ans);
            }
            else if (e.equals("?")){
                float x = Float.parseFloat(q);
                float y = Float.parseFloat(w);
                System.out.println(x + " + " + y + " = " + e);
                System.out.println(" ?" + " = " + (x + y));
            }
        }
        System.out.println("Хотите продолжить работать с программой? y/n");
        String ans = scanner.next();
        if (ans.equals("n")){ return true; }
        else return false;
    }
    public static int Calculate(char op, int a, int b){
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
