package ru.gb.seminario_5;
public class Student {

    String _name;
    String surName;
    double rating;

    public Student(String name, String surName, double rating){
        _name = name;
        this.surName = surName;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return surName + " " + _name;
    }
}
