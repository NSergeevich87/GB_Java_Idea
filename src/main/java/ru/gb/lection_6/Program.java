package ru.gb.lection_6;

public class Program {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.id = 001;
        w1.firstName = "Nikita";
        w1.lastName = "Nikiforov";
        w1.salary = 3000;

        System.out.println(w1.toString());
    }
}
