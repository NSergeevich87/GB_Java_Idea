package ru.gb.oop.homework4;

import ru.gb.oop.seminario4.data.Teacher;

public interface TeacherControllerInterface<T extends Teacher> {
    void create(String firstName, String secondName, Long teacherID);
}
