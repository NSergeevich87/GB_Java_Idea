package ru.gb.oop.lection4.task1;

public class Program {
    public static void main(String[] args) {
        Number1 number1 = new Number1(5);
        Number2 number2 = new Number2(5);

        System.out.println(number1.getNumber() + number2.getNumber());
    }
}
