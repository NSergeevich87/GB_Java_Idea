package ru.gb.oop.homework5;

import ru.gb.oop.homework5.controller.Controller;
import ru.gb.oop.homework5.data.StudyGroup;
import ru.gb.oop.seminario5.model.Student;
import ru.gb.oop.seminario5.model.Teacher;
import ru.gb.oop.seminario5.model.User;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<User> students = new ArrayList<>();
        Controller controller = new Controller();

        Teacher teacher = new Teacher("Nikita", "Nikiforov", "Sergeevich", 125);
        Student student1 = new Student("Popa", "Nikiforov", "Sergeevich", 11);
        Student student2 = new Student("Mopa", "Nikiforov", "Sergeevich", 12);
        Student student3 = new Student("Boba", "Nikiforov", "Sergeevich", 13);
        Student student4 = new Student("Kola", "Nikiforov", "Sergeevich", 15);
        Student student5 = new Student("Gola", "Nikiforov", "Sergeevich", 14);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudyGroup studyGroup = new StudyGroup(teacher, students);
        controller.createStudyGroup(teacher, studyGroup.getStudentList());

        controller.getTeacherId();
        controller.getStudyGroupId();
    }
}
