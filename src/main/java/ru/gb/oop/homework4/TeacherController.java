package ru.gb.oop.homework4;

import ru.gb.oop.seminario4.data.Teacher;

import java.util.List;

public class TeacherController implements TeacherControllerInterface{
    private TeacherViewInterface teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, Long teacherID) {
        Teacher newTeacher = new Teacher(firstName, secondName, teacherID);
    }
    public void printConsole(List<Teacher> teacherList){
        teacherView.sendOnConsole(teacherList);
    }
}
