package ru.gb.practice.oop_person;

public class Person {
    private String fullName;
    private int age;
    public Person(){
        this.fullName = "Приведение";
        this.age = 645;
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    public void move(){
        System.out.println(fullName + " пошел в жопу!");
    }
    public void talk(){
        System.out.println(fullName + " сам пошел в жопу!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
