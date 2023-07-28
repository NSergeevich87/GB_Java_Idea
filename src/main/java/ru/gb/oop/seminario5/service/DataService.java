package ru.gb.oop.seminario5.service;

import ru.gb.oop.seminario5.model.Student;
import ru.gb.oop.seminario5.model.Teacher;
import ru.gb.oop.seminario5.model.Type;
import ru.gb.oop.seminario5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;

    public List<User> getUsersAll() {
        return userList;
    }
    public List<User> getStudentAll(){
        List<User> resultList = new ArrayList<>();
        for (User user: userList){
            if (user instanceof Student){
                resultList.add(user);
            }
        }
        return resultList;
    }
    public void create(String firstName, String secondName, String lastName, Type type){
        int id = getFreeId(type);
        if (Type.STUDENT == type){
            Student student = new Student(lastName, firstName, secondName, id);
            userList.add(student);
        }
        if (Type.TEACHER == type){
            Teacher teacher = new Teacher(lastName, firstName, secondName, id);
            userList.add(teacher);
        }
    }
    public User getUserId(Type type, int id){
        User resultUser = null;
        boolean isStudent = Type.STUDENT == type;
        for (User user: userList) {
            if (isStudent && user instanceof Student && ((Student) user).getStudentId() == id){
                resultUser = user;
            }
            if (!isStudent && user instanceof Teacher && ((Teacher) user).getTeacherId() == id){
                resultUser = user;
            }
        }
        return resultUser;
    }
    private int getFreeId(Type type){
        int lastId = 1;
        boolean isStudent = Type.STUDENT == type;
        for (User user: userList) {
            if (isStudent && user instanceof Student){
                lastId = ((Student) user).getStudentId() + 1;
            }
            if (!isStudent && user instanceof Teacher){
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return lastId;
    }
}

/*package service;

        import model.Student;
        import model.Teacher;
        import model.Type;
        import model.User;

        import java.util.List;

public class DataService {
    private List<User> userList;

    public void create(String lastName, String firstName, String secondName, Type type){
        int id = getFreeId(type);
        if (Type.STUDENT == type){
            Student student = new Student(lastName,firstName,secondName,id);
            userList.add(student);
        }
        if(Type.TEACHER == type){
            Teacher teacher = new Teacher(lastName,firstName,secondName,id);
            userList.add(teacher);
        }
    }

    public User getUserID(Type type, int id){
        User resultuser = null;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : userList){
            if(itsStudent && user instanceof Student && ((Student) user ).getStudentID() == id){
                resultuser = user;
            }
            if(!itsStudent && user instanceof Teacher && ((Teacher) user ).getTeacherId() == id){
                resultuser = user;
            }
        }
        return resultuser;
    }

    public List<User> getAllUsers(){
        return userList;
    }

    private int getFreeId(Type type){
        int lastID = 1;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : userList){
            if(itsStudent && user instanceof Student){
                lastID = ((Student) user ).getStudentID() + 1;
            }
            if(!itsStudent && user instanceof Teacher){
                lastID = ((Teacher) user ).getTeacherId() + 1;
            }
        }
        return lastID;
    }
}*/
