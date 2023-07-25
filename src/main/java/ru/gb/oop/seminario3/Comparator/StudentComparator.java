package ru.gb.oop.seminario3.Comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student3> {
    @Override
    public int compare(Student3 o1, Student3 o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
