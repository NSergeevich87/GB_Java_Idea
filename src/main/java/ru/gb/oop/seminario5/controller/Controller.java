package ru.gb.oop.seminario5.controller;

import ru.gb.oop.seminario5.model.Student;
import ru.gb.oop.seminario5.model.Type;
import ru.gb.oop.seminario5.model.User;
import ru.gb.oop.seminario5.service.DataService;
import ru.gb.oop.seminario5.view.StudentView;

import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    StudentView view = new StudentView();
    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }
    public void getAllStudent(){
        List<User> userList = dataService.getStudentAll();
        for (User user: userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }
}
