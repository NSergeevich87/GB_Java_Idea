package ru.gb.oop.homework3;

import java.util.List;

public class StudentGroupService {
    private StudentsGroup studentsGroup;

    public StudentGroupService(){
        this.studentsGroup = new StudentsGroup();
    }
    public StudentGroupService(StudentsGroup studentsGroup){
        this.studentsGroup = studentsGroup;
    }

    public StudentsGroup getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    public boolean removeStudent(String firstName, String secondName, String lastName){
        Student removeStudent = new Student(null, firstName, secondName, lastName);
        if (studentsGroup.getStudents() == null) return false;
        List<Student> studentsList = studentsGroup.getStudents();
        for (Student student: studentsList) {
            if (student.equals(removeStudent)){
                studentsList.remove(student);
                return true;
            }
        }
        return false;
    }
}
