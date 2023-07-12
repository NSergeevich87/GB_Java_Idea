package ru.gb.homework_6;

import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setGenero("Lechón");
        cat.setColor("Amarillo");
        cat.setTamaño(50);
        System.out.println(cat);
        System.out.println(cat.getGenero());
        task();
    }

    static void task(){
        HashSet<Cat> hashSet = new HashSet<>();
        hashSet.add(new Cat("Мейкун", 20, "Черный"));
        hashSet.add(new Cat("Сфинкс", 10, "Кожаный"));
        hashSet.add(new Cat("Ориентал", 15, "Черепашчатый"));
        hashSet.add(new Cat("Мейкун", 20, "Черный"));
        System.out.println(hashSet);
        System.out.println();
        System.out.printf("Равенство котов: %b", new Cat("Мейкун", 20, "Черный").equals(new Cat("Мейкун", 20, "Черный")));
        System.out.println();
        System.out.printf("Равенство котов: %b", new Cat("Мейкун", 20, "Черный").equals(new Cat("Ориентал", 15, "Черепашчатый")));
        System.out.println();
        System.out.println(hashSet);
    }
}
