package ru.gb.oop.lection3.Ex004;

//import Lesson_09.Ex004.ExBeverage.*;

import ru.gb.oop.lection3.Ex004.ExBeverage.Coffee;
import ru.gb.oop.lection3.Ex004.ExBeverage.Water;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
