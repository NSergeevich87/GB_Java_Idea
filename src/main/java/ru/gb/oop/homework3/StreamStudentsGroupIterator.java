package ru.gb.oop.homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamStudentsGroupIterator implements Iterator<StudentsGroup> {

    private List<StudentsGroup> studentsGroups;
    private int counter;

    public StreamStudentsGroupIterator(Stream stream){
        this.studentsGroups = stream.getStudentsGroups();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return  counter < studentsGroups.size() - 1;
    }

    @Override
    public StudentsGroup next() {
        if (!hasNext()) return null;
        counter++;
        return studentsGroups.get(counter);
    }

    @Override
    public void remove() {
        studentsGroups = new ArrayList<>();
        counter = 0;
    }
}
