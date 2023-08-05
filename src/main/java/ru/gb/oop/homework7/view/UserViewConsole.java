package ru.gb.oop.homework7.view;

import ru.gb.oop.homework7.interfaces.CreateCalc;
import ru.gb.oop.homework7.interfaces.Operations;

import java.util.Scanner;

public class UserViewConsole {
    private CreateCalc createCalc;
    public UserViewConsole(CreateCalc createCalc){
        this.createCalc = createCalc;
    }
    public void programStart(){
        while (true){
            double firstNum = promptDouble("Input number for calculate: ");
            Operations operations = createCalc.create(firstNum);
            while (true){
                String operation = prompt("Input operation, one of [/*-+] or [=] for result -> ");
                if (operation.equals("/")){
                    double num = promptDouble("Input second number: ");
                    operations.div(num);
                    continue;
                }
                if (operation.equals("*")){
                    double num = promptDouble("Input second number: ");
                    operations.mult(num);
                    continue;
                }
                if (operation.equals("-")){
                    double num = promptDouble("Input second number: ");
                    operations.menos(num);
                    continue;
                }
                if (operation.equals("+")){
                    double num = promptDouble("Input second number: ");
                    operations.sum(num);
                    continue;
                }
                if (operation.equals("=")){
                    double result = operations.getResult();
                    System.out.printf("Result %f\n", result);
                    break;
                }
            }
            String operation = prompt("Input more? y/n: ");
            if (operation.equals("y")){
                continue;
            }
            break;
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
