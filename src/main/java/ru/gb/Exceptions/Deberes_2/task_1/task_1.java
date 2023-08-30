package ru.gb.Exceptions.Deberes_2.task_1;

import java.util.Scanner;

import static java.lang.Float.parseFloat;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/
public class task_1 {
    static Scanner scanner = new Scanner(System.in);
    static float num;
    static boolean stop;
    public static void main(String[] args) {
        while (!stop){
            System.out.println("Введите дробное число: ");
            String answer = scanner.nextLine();
            number(answer);
        }
        System.out.println("Вы ввели: " + num);
    }

    public static float number(String str){
            try {
                num = parseFloat(str);
                stop = true;
                return num;
            } catch (Exception e){
                System.out.println("Вы ввели нудопустимое значение.");
            }
        return num;
    }
}
