package ru.gb.oop.seminario3.InterfaceIterable;

public class Controler {
    private final InterfaceIterable.StudentGroupService3 studentGroupService = new InterfaceIterable.StudentGroupService3();

    public void removeStudentByFIO(String lastName, String secondName, String firstName){
        studentGroupService.removeStudentByFIO(lastName,secondName,firstName);
    }
}
