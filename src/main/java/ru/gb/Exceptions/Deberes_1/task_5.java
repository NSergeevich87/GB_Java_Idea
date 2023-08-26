package ru.gb.Exceptions.Deberes_1;

public class task_5 {
    public static void main(String[] args) {
        int[] a = {12, 8, 16};
        int[] b = {4, 2, 4};
    }
    public static int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int[] c = new int[a.length];
        if (a.length != b.length){
            c = new int[1];
        } else {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] / b[i];
            }
        }
        return c;
    }
}
