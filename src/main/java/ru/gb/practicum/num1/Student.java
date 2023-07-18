package ru.gb.practicum.num1;

public class Student {
    private String fullName;
    private String numberOfGroup;
    private int grades[];
    private int nGrades;

    public Student(String fullName, String numberOfGroup){
        this.fullName = fullName;
        this.numberOfGroup = numberOfGroup;
        grades = new int[5];
        nGrades = 0;
    }

    public boolean addGrade(int grade){
        if (nGrades >= 5) return false;
        grades[nGrades] = grade;
        nGrades++;
        return true;
    }
    public boolean isGood(){
        for (int i = 0; i < nGrades; i++) {
            if (grades[i] != 9 && grades[i] != 10){
                return false;
            }
        }
        return true;
    }

    public void Print(){
        System.out.println(fullName + " " + numberOfGroup);
        System.out.print("Ozenki: ");
        for (int i = 0; i < nGrades; i++) {
            System.out.print(Integer.toString(grades[i]) + " ");
        }
        System.out.println("\n");
    }
}
