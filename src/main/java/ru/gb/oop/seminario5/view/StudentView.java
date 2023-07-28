package ru.gb.oop.seminario5.view;

import ru.gb.oop.seminario5.model.Student;

public class StudentView {
    public void printOnConsole(Student student){
        System.out.println(student.toString());
    }
}
