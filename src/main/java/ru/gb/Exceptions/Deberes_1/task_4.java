package ru.gb.Exceptions.Deberes_1;

public class task_4 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};
        System.out.println(subArrays(a, b));
    }
    public static int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int[] c = new int[a.length];
        if (a.length != b.length){
            c = new int[1];
            return c;
        }
        else {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];
            }
        }
        return c;
    }
}
