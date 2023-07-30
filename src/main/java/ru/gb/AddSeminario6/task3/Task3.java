package ru.gb.AddSeminario6.task3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
//        3)Найти пересечения слов в массивах и указать их общее количество.
//        Пример:
//        Mas1= [“qwe”,”asd”,”qwe”,”x”]
//        Mas2=[“qwe”,”v”]
//        Результат:
//        qwe=3
        String[] mas1 = {"qwe", "asd", "qwe", "x"};
        String[] mas2 = {"qwe", "v"};

        Set<String> resMas1 = new HashSet<>(Arrays.asList(mas1));
        Set<String> resMas2 = new HashSet<>(Arrays.asList(mas2));
        Set<String> result = new HashSet<>(resMas1);
        System.out.println("result.retainAll(resMas2) = " + result.retainAll(resMas2));
        System.out.println("result = " + result);
        System.out.println("resMas1 = " + resMas1);
        System.out.println("resMas2 = " + resMas2);

        //String[] masSum = new String[];
        for (String massRes: result) {
            int count = 0;
            for (int i = 0; i < mas1.length; i++) {
                if (massRes.equals(mas1[i])){
                    count++;
                }
                for (int j = 0; j < mas2.length; j++) {
                    if (massRes.equals(mas2[i])){
                        count++;
                    }
                }
                System.out.println("massRes = " + massRes + " = " + count);
            }
        }


    }
}
