package ru.gb.oop.seminario3.Comparable;
import java.util.List;
public class Controler3 {
    private final StudentGroupService3 studentGroupService = new StudentGroupService3();

    public void removeStudentByFIO(String lastName, String secondName, String firstName){
        studentGroupService.removeStudentByFIO(lastName,secondName,firstName);
    }

    public List<Student3> getSortedStudentList(){
        return studentGroupService.getSortedStudentList();
    }
}
