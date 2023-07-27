package ru.gb.oop.seminario4.view;

import ru.gb.oop.seminario4.data.Student;

import java.util.List;

public class StudentView implements UserViewInterface<Student> {
    @Override
    public void sendOnConsole(List<Student> listT){
        System.out.println("Spisok studentov");
        for (Student student: listT) {
            System.out.println(student.getStudentId());
        }
    }
}
