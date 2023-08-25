package ru.gb.Exceptions.Seminario_1.task_3;

public class task_3 {
    public static void main(String[] args) {
        checkArray(new Integer[] {1, 2, null, 4, 5});
    }
    private static void checkArray(Integer[] array){
        for (int i = 0; i < array.length; i++) {
            try {
                if (array[i] == null) throw new NullPointerException(String.format("element with index %s iquals null", i));
            } catch (RuntimeException exception){
                exception.printStackTrace();
            }
        }
    }
}
