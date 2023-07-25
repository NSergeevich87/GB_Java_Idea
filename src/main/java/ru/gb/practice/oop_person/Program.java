package ru.gb.practice.oop_person;

public class Program {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Nikita", 35);

        System.out.println(person1);
        System.out.println(person2);

        person1.move();
        person2.talk();
    }
}
