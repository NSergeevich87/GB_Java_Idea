package ru.gb.oop.seminario3;

import ru.gb.oop.seminario3.Comparator.Student3;
import ru.gb.oop.seminario3.Comparator.StudentComparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student3 student1 = new Student3();
        student1.setStudentId(2345L);
        student1.setFirstName("Nikita");
        student1.setSecondName("Nikiforov");
        student1.setLastName("Sergeevich");

        Student3 student2 = new Student3();
        student2.setStudentId(234L);
        student2.setFirstName("Nikita");
        student2.setSecondName("Nikiforov");
        student2.setLastName("Ivanovich");

        StudentComparator studentComparator = new StudentComparator();
        System.out.println(studentComparator.compare(student2, student1));
    }
}
