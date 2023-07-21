package ru.gb.oop.seminario3;

public class Student {
    private Integer numberOfStudent;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(Integer numberOfStudent, String firstName, String secondName, String lastName){
        this.numberOfStudent = numberOfStudent;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public int getNumberOfStudent(){
        return numberOfStudent;
    }
    public void setNumberOfStudent(int number){
        this.numberOfStudent = number;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }
    public String getSecondName(){
        return secondName;
    }
    public void setSecondName(String name){
        this.secondName = name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String name){
        this.lastName = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Student student = (Student) o;
        return  (this.firstName.equals(student.firstName)
                && this.secondName.equals(student.secondName)
                && this.lastName.equals(student.lastName));
    }

    @Override
    public String toString() {
        return "Student{" +
                "numberOfStudent=" + numberOfStudent +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
