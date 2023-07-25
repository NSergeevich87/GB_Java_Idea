package ru.gb.oop.seminario3.Comparable;

import java.util.Iterator;
import java.util.List;
public class StudentGroupIterator implements Iterator<Student3> {
    private int counter;
    private  final List<Student3> studentList;

    public StudentGroupIterator(StudentGroupt3 studentGroup) {
        this.studentList = studentGroup.getStudentsList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size() - 1;
    }

    @Override
    public Student3 next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return studentList.get(counter);
    }


    @Override
    public void remove() {
        studentList.remove(counter);
    }
}
