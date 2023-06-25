package ru.gb.api.nsergeevich;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printName();
        task2();
        task3("Vvedenie po kursu");

        int num = Integer.parseInt(scanner.nextLine());


    }

    static  void task3(String str){
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--){
            System.out.printf("%s", words[i]);
        }
    }

    static void printName(){
        int i = 12;
        double j = 5.5;

        System.out.println("Vvedite imya: ");
        String name = scanner.nextLine();
        System.out.println("Privet, " + name + "!");
        System.out.printf("Privet, %s ! %d %f\n", name, i, j);
    }

    static  void  task2(){
        int counter = 0;
        int max = 0;

        int[] array1 = new int[5];
        int[] array2 = {1, 0, 0, 1, 1, 1, 0, 1};
        for (int i : array2) {
            if (i == 1)
                counter++;
            else {
                if (counter > max)
                    max = counter;
                counter = 0;
            }
        }
        System.out.printf("");
    }
}
