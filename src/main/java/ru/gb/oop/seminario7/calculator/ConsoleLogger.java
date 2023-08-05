package ru.gb.oop.seminario7.calculator;

public class ConsoleLogger implements Loggable{

    @Override
    public void log(String message) {
        System.out.println("LOG:" + message);
    }
}
