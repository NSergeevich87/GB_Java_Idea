package ru.gb.oop.homework3;

public class StudentController {
    private StudentGroupService studentGroupService;
    public static void main(String[] args) {
        Student student1 = new Student(12, "nikita", "nikiforov", "sergeevich");
        Student student2 = new Student(21, "kseniia", "volkova", "yuryevna");
        Student student3 = new Student(12, "petr", "nikiforov", "sergeevich");
        Student student4 = new Student(21, "genya", "volkova", "yuryevna");
        Student student5 = new Student(12, "svinka", "nikiforov", "sergeevich");
        Student student6 = new Student(21, "pupkin", "volkova", "yuryevna");

        StudentsGroup stream1Group1 = new StudentsGroup();
        stream1Group1.addStudent(student1);
        stream1Group1.addStudent(student2);
        StudentsGroup stream1Group2 = new StudentsGroup();
        stream1Group2.addStudent(student3);
        stream1Group2.addStudent(student4);

        StudentsGroup stream2Group1 = new StudentsGroup();
        stream2Group1.addStudent(student5);
        stream2Group1.addStudent(student6);
        StudentsGroup stream2Group2 = new StudentsGroup();
        stream2Group2.addStudent(student1);
        stream2Group2.addStudent(student2);
        StudentsGroup stream2Group3 = new StudentsGroup();
        stream2Group3.addStudent(student3);
        stream2Group3.addStudent(student4);

        Stream stream1 = new Stream();
        stream1.addStudentsGroup(stream1Group1);
        stream1.addStudentsGroup(stream1Group2);
        System.out.println("Количество групп в 1ом потоке -> " + stream1.returnSizeGroups());

        Stream stream2 = new Stream();
        stream2.addStudentsGroup(stream2Group1);
        stream2.addStudentsGroup(stream2Group2);
        stream2.addStudentsGroup(stream2Group3);
        System.out.println("Количество групп во 2ом потоке -> " + stream2.returnSizeGroups());

        StreamComparator one = new StreamComparator(stream1);
        StreamComparator two = new StreamComparator(stream2);
        System.out.println(one.compareTo(stream2));
        System.out.println(two.compareTo(stream1));
    }
}
