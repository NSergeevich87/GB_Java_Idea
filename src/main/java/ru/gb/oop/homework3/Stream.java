package ru.gb.oop.homework3;

import ru.gb.oop.seminario3.StudentsGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudentsGroup> {
    private List<StudentsGroup> studentsGroups;
    private int counter = 0;
    public Stream(){
        studentsGroups = new ArrayList<>();
        this.counter = 0;
    }
    public Stream(List<StudentsGroup> studentsGroups){
        setStudentsGroups(studentsGroups);
        this.counter = 0;
    }
    public void addStudentsGroup(StudentsGroup group){
        studentsGroups.add(group);
    }
    public List<StudentsGroup> getStudentsGroups(){
        return studentsGroups;
    }
    public void setStudentsGroups(List<StudentsGroup> studentsGroups){
        this.studentsGroups = studentsGroups;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "studentsGroups=" + studentsGroups +
                '}';
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
