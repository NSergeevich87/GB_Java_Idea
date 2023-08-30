package ru.gb.Exceptions.Deberes_2.task_4;

import java.util.Scanner;

public class task_4 {
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите что-нибудь: ");
        System.out.println("Вы ввели: " + checkMessage(scanner.nextLine()));
        scanner.close();
    }
    public static String checkMessage(String str){
        if (str.isEmpty()){
            throw new RuntimeException("Пустые строки вводить нельзя!");
        } else return str;
    }
}
