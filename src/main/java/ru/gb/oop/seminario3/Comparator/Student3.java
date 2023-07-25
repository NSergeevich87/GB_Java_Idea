package ru.gb.oop.seminario3.Comparator;

public class Student3 implements Comparable<Student3>{
    private Long studentId;
    private String firstName;
    private String secondName;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;

    @Override
    public int compareTo(Student3 o) {
        return this.studentId.compareTo(o.studentId);
    }
}
