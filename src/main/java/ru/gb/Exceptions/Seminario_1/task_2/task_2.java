package ru.gb.Exceptions.Seminario_1.task_2;

public class task_2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(sumArray2D(new int[][]{{1,0,2,1},{1,0,2,1}}));
    }
    private static int sumArray2D(int[][] array){
        checkException(array[0].length != array[1].length, "array no squad");
        /*if (array[0].length != array[1].length){
            throw new RuntimeException("array no squad");
        }*/
        int sum = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                checkException(array[i][j] != 0 && array[i][j] != 1, "elem != 0 or != 1");
                sum += array[i][j];
            }
        }
        return sum;
    }
    private static void checkException(boolean check, String msg){
        if (check){
            throw new RuntimeException(msg);
        }
    }
}
