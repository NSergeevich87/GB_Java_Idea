package ru.gb.oop.seminario3.InterfaceIterable;

import InterfaceIterator.Student;
import InterfaceIterator.StudentGroupt2;

import java.util.Iterator;

public class StudentGroupService {
    private StudentGroupt2 studentGroupt2;
    public void removeStudentByFIO(String lastName, String secondName, String firstName){
        Iterator<Student> iterator = studentGroupt2.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)&&
                    student.getLastName().equals(lastName)){
                iterator.remove();
            }
        }
    }
}
