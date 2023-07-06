package ru.gb.homework_4.task2;

public class Program {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.enqueue(5);
        myQueue.enqueue("пять");
        myQueue.enqueue(10);
        myQueue.enqueue("десять");

        System.out.println(myQueue.first());
        myQueue.dequeue();
        System.out.println(myQueue.first());
        myQueue.dequeue();
        System.out.println(myQueue.first());
        myQueue.dequeue();
        System.out.println(myQueue.first());
    }
}
