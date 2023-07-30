package ru.gb.AddSeminario6.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,5,4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(8,5,6,7));
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("result = " + result);
    }
}
