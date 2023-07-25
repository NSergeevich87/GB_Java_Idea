package ru.gb.oop.seminario3.InterfaceIterable;

import java.util.Iterator;
import java.util.List;

public class StudentGroupt2 implements Iterable<Student> {
    private List<Student> studentsList;


    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
