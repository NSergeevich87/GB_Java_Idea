package ru.gb.oop.homework5.data;

import ru.gb.oop.seminario5.model.Student;
import ru.gb.oop.seminario5.model.Teacher;
import ru.gb.oop.seminario5.model.User;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<User> studentList;
    public StudyGroup(Teacher teacher, List<User> studentList){
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public void getTeacher() {
        System.out.println(teacher.toString());
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<User> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<User> studentList) {
        this.studentList = studentList;
    }
    public void createStudent(User user){
        studentList.add((Student) user);
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }
}
