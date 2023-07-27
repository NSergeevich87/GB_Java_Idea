package ru.gb.oop.seminario4.controller;

import ru.gb.oop.seminario4.data.Student;
import ru.gb.oop.seminario4.data.Teacher;
import ru.gb.oop.seminario4.data.User;
import ru.gb.oop.seminario4.service.DataService;
import ru.gb.oop.seminario4.service.StudentGroupService;
import ru.gb.oop.seminario4.view.UserView;

import java.time.LocalDate;
import java.util.List;

public class OldUserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();

    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }
}
