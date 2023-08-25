package ru.gb.Exceptions.Seminario_1.task_4;

import java.util.Arrays;

public class task_4 {
    private static int[] someArray = {1, 3, 4, 5};
    private static int[] someArray2 = {5, 3, 2, 1};
    private static int[] someArray3 = {5, 3, 2, 1, 0};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumTwoArray(someArray, someArray2)));
        System.out.println(Arrays.toString(sumTwoArray(someArray, someArray3)));
    }
    private static int[] sumTwoArray(int[] array1, int[] array2){
        int[] result = null;
        try {
            if (array1.length != array2.length) throw new RuntimeException("length of array !=");
            result = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                result[i] = array1[i] + array2[i];
            }
            return result;
        } catch (RuntimeException e){
            e.printStackTrace();
        }
        return result;
    }
}
