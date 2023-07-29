package ru.gb.oop.homework5.service;

import ru.gb.oop.homework5.data.StudyGroup;
import ru.gb.oop.seminario5.model.Teacher;
import ru.gb.oop.seminario5.model.User;

import java.util.List;

public class StudyGroupService {
    private StudyGroup studyGroup;
    public void createStudyGroup(Teacher teacher, List<User> students){
        this.studyGroup = new StudyGroup(teacher, students);
    }
    public void createStudent(User user){
        studyGroup.createStudent(user);
    }
    public StudyGroup getStudyGroup() {
        return studyGroup;
    }
    public List<User> getStudentList(){
        return studyGroup.getStudentList();
    }
    public void getTeacher(){
        studyGroup.getTeacher();
    }
}
