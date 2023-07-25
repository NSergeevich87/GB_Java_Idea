package ru.gb.oop.seminario3.Comparator;

import java.util.Iterator;
import java.util.List;

public class StudentGroupt3 implements Iterable<Student3> {
    private List<Student3> studentsList;


    public List<Student3> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student3> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public Iterator<Student3> iterator() {
        return new StudentGroupIterator(this);
    }
}
