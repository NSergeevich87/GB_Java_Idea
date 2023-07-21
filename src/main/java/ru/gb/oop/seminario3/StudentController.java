package ru.gb.oop.seminario3;

public class StudentController {
    private StudentGroupService studentGroupService;
    public static void main(String[] args) {


        Student student1 = new Student(12, "nikita", "nikiforov", "sergeevich");
        Student student2 = new Student(21, "kseniia", "volkova", "yuryevna");
        Student student3 = new Student(12, "petr", "nikiforov", "sergeevich");
        Student student4 = new Student(21, "genya", "volkova", "yuryevna");
        Student student5 = new Student(12, "svinka", "nikiforov", "sergeevich");
        Student student6 = new Student(21, "pupkin", "volkova", "yuryevna");

        StudentsGroup studentsGroup = new StudentsGroup();
        studentsGroup.addStudent(student1);
        studentsGroup.addStudent(student2);
        studentsGroup.addStudent(student3);
        studentsGroup.addStudent(student4);
        studentsGroup.addStudent(student5);
        studentsGroup.addStudent(student6);

        StudentGroupService studentGroupService = new StudentGroupService();
        studentGroupService.setStudentsGroup(studentsGroup);

        System.out.println(studentsGroup);

        studentGroupService.removeStudent("nikita", "nikiforov", "sergeevich");

        System.out.println(studentsGroup);
    }
}
