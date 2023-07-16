package ru.gb.AddSeminario2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo: ");
        double x = scanner.nextDouble();
        System.out.println("Vvedite stepen: ");
        int n = scanner.nextInt();
        scanner.close();
        double result;

        if (n > 0) {
            result = x;
        } else {
            result = 1 / x;
        }

        for (int i = 1; i < n; i++) {
            result *= x;
        }
        System.out.println("result = " + result);
    }
}
