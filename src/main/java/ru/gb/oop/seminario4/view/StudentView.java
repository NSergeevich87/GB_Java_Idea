package ru.gb.oop.seminario4.view;

import ru.gb.oop.seminario4.data.Student;

import java.util.List;

public class StudentView implements UserViewInterface<Student> {
    /**
     * Принцип единственной ответственности, данный класс выполняет только один метод печать в консоль.
     */
    /**
     * Принцип открытости/закрытости, здесь мы не вносим изменения в родительский класс, а просто
     * переопределяем метод/ы
     * Принцип подстановки Барбары Лисков (LSP), переопределили метод, не нарушив функциональность.
     */
    @Override
    public void sendOnConsole(List<Student> listT){
        System.out.println("Spisok studentov");
        for (Student student: listT) {
            System.out.println(student.getStudentId());
        }
    }
}
