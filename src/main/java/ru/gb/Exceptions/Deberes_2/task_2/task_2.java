package ru.gb.Exceptions.Deberes_2.task_2;

public class task_2 {
    //Если необходимо, исправьте данный код
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = new int[8];
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
