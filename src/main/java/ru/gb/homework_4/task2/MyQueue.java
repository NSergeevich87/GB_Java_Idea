package ru.gb.homework_4.task2;

import java.util.LinkedList;

public class MyQueue<T> {
    private LinkedList<T> list = new LinkedList<T>();

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        if (list.isEmpty()) {
            throw new RuntimeException("Пустой");
        }
        return list.removeFirst();
    }

    public T first() {
        if (list.isEmpty()) {
            throw new RuntimeException("Пустой");
        }
        return list.getFirst();
    }
}
