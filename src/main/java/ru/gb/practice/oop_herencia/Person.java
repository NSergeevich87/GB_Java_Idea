package ru.gb.practice.oop_herencia;

public abstract class Person {
    private String name;
    private String lastName;
    private int age;
    public Person(){

    }
    public abstract int getScholarship();
    public abstract String returnName();

    public void Speak(){
        System.out.println(name + " говорит.");
    }
}
