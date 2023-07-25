package ru.gb.oop.seminario3.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService3 {
    private StudentGroupt3 studentGroupt3;
    public void removeStudentByFIO(String lastName, String secondName, String firstName){
        Iterator<Student3> iterator = studentGroupt3.iterator();
        while (iterator.hasNext()){
            Student3 student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)&&
                    student.getLastName().equals(lastName)){
                iterator.remove();
            }
        }
    }
    public List<Student3> getSortedStudentList(){
        List<Student3> studentList = new ArrayList<>(studentGroupt3.getStudentsList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student3> getSortedStudentByFIO(){
        List<Student3> studentList = new ArrayList<>(studentGroupt3.getStudentsList());
        studentList.sort(new StudentComparator());
        return studentList;
    }
}
