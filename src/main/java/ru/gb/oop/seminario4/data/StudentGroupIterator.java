package ru.gb.oop.seminario4.data;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    /**
     * Принцип единственной ответственности, данный класс выполняет только методы присущие итератору.
     * Принцип инверсии зависимостей (DIP), зависимости внутри системы строятся на основе абстракций
     */
    private int counter;
    private final List<Student> students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }
    /**
     * Принцип открытости/закрытости, здесь мы не вносим изменения в родительский класс, а просто
     * переопределяем метод/ы
     * Принцип подстановки Барбары Лисков (LSP), переопределили метод, не нарушив функциональность.
     */
    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(counter);
    }
}
