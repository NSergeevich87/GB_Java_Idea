package ru.gb.oop.lection4.profesor.Lesson_11.Ex001Calc;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new View());
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }
}
