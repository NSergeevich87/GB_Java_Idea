package ru.gb.oop.lection4.profesor.Lesson_11.Ex003Math.Client;

import java.util.Scanner;

import Ex003Math.Core.Views.View;

public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    };

    @Override
    public void set(String value) {
        System.out.println(value);

    }
}
