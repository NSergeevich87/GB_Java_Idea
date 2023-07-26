package ru.gb.practice.oop_herencia;

public class Student extends Person {
    private String name;
    private String lastName;
    private int age;
    private int groupNumber;
    private Double averageMark;
    public Student(String name, String lastName, int age, int groupNumber, Double averageMark){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.groupNumber = groupNumber;
        this.averageMark = averageMark;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGroupNumber(int groupNumber){
        this.groupNumber = groupNumber;
    }
    public int getGroupNumber(){
        return groupNumber;
    }
    @Override
    public int getScholarship(){
        return averageMark == 5 ? 1900 : 1000;
    }
    @Override
    public String returnName(){
        return name;
    }
    @Override
    public void Speak(){
        System.out.println(this.name + " говорит.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                ", averageMark=" + averageMark +
                '}';
    }
}
