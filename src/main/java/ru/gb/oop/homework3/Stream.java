package ru.gb.oop.homework3;

import java.util.ArrayList;
import java.util.List;

public class Stream implements Iterable<StudentsGroup> {
    private List<StudentsGroup> studentsGroups;
    public Stream(){
        studentsGroups = new ArrayList<>();
    }
    public Stream(List<StudentsGroup> studentsGroups){
        setStudentsGroups(studentsGroups);
    }
    public void addStudentsGroup(StudentsGroup group){
        studentsGroups.add(group);
    }
    public List<StudentsGroup> getStudentsGroups(){
        return studentsGroups;
    }

    public int returnSizeGroups(){
        return studentsGroups.size();
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
    public StreamStudentsGroupIterator iterator() {
        return new StreamStudentsGroupIterator(this);
    }

}
