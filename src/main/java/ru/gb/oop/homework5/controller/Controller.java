package ru.gb.oop.homework5.controller;

import ru.gb.oop.homework5.service.StudyGroupService;
import ru.gb.oop.seminario5.model.Student;
import ru.gb.oop.seminario5.model.Teacher;
import ru.gb.oop.seminario5.model.User;

import java.util.List;

public class Controller {
    StudyGroupService studyGroupService = new StudyGroupService();
    public void createStudyGroup(Teacher teacher, List<User> students){
        studyGroupService.createStudyGroup(teacher, students);
    }
    public void getStudyGroupId(){
        List<User> userList = studyGroupService.getStudentList();
        for (User user: userList) {
            Student student = (Student) user;
            System.out.println("StudentId: " + student.getStudentId());
        }
    }
    public void getTeacherId(){
        studyGroupService.getTeacher();
    }
}
