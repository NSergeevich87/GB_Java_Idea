package ru.gb.oop.homework4;

import ru.gb.oop.seminario4.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Nikita", "Nikiforov", 12379L);
        Teacher teacher2 = new Teacher("Kseniia", "Volkova", 756485L);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);

        TeacherGroup teachers = new TeacherGroup("Biology", teacherList);
        TeacherController teacherController = new TeacherController();
        teacherController.create("Nikita", "Nikiforov", 12379L);
        teacherController.create("Kseniia", "Volkova", 756485L);

        teacherController.printConsole(teacherList);
    }
}
