package ru.gb.practice.oop_herencia;

public class Aspirant extends Person{
    private String name;
    private String lastName;
    private int age;
    private Double averageMark;
    private String sinceWork;

    public Aspirant(String name, String lastName, int age, String sinceWork, Double averageMark){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sinceWork = sinceWork;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSinceWork() {
        return sinceWork;
    }

    public void setSinceWork(String sinceWork) {
        this.sinceWork = sinceWork;
    }
    @Override
    public int getScholarship(){
        return averageMark == 5 ? 2500 : 2200;
    }
    @Override
    public String returnName(){
        return name;
    }
    @Override
    public void Speak() {
        System.out.println(this.name + " говорит.");
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", averageMark=" + averageMark +
                ", sinceWork='" + sinceWork + '\'' +
                '}';
    }
}
