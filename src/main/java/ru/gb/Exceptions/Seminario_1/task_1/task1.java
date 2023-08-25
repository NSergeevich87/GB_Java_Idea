package ru.gb.Exceptions.Seminario_1.task_1;

public class task1 {
    private static int[] newArray = {3, 5, 9, 4, 1, 5, 2, -1, 0};
    private static int findValue;

    public static void main(String[] args) {
        System.out.println("Find in array some numbers");
        findValue = 5;
        System.out.printf("result of looking for number %s in array: %s", findValue, findNumberInArray(newArray, findValue));
        System.out.println();
        System.out.printf("result of looking for number %s in array: %s", findValue, findNumberInArray(new int[]{2, 4}, findValue));
    }

    private static void inputNumber() {

    }

    private static int findNumberInArray(int[] array, int findValue) {

        if (array == null) {
            return -3;
        }
        if (array.length < 3) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == findValue) {
                return i;
            }
        }
        return -2;
    }
}
