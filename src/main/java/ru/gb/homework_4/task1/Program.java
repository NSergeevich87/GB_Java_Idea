package ru.gb.homework_4.task1;

import java.util.*;

public class Program {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Deque deque = new ArrayDeque();
        while (true){
            System.out.println("q для выхода из приложения, print для печати перевернутого списка.");
            System.out.print("Введите строку: ");
            String inputString = scanner.nextLine();
            if (inputString.isEmpty() || inputString.equals("q")) {
                System.out.println("Выход из приложения");
                break;
            }
            String[] data = inputString.split(" ");
            linkedList.add(data[0]);
            switch (inputString) {
                case "print":
                    for (Object e : deque)
                        System.out.println(e);

                default:
                    deque.push(inputString);
                    break;
            }
        }
        System.out.println(linkedList);
    }
}
