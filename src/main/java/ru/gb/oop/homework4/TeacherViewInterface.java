package ru.gb.oop.homework4;

import ru.gb.oop.seminario4.data.Teacher;

import java.util.List;

public interface TeacherViewInterface<T extends Teacher> {
    public void sendOnConsole(List<T> tList);
}
