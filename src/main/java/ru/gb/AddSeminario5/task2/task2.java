package ru.gb.AddSeminario5.task2;

import java.util.HashMap;
import java.util.Map;

public class task2 {
//    2)Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
//    В противном случае (false).
    public static void main(String[] args) {
        Integer[] array = {1, 2, 4, 89, 678};
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!hashMap.containsKey(array[i])){
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            }
            else {
                hashMap.put(array[i], 1);
            }
        }
        Boolean flag = false;
        for (Map.Entry<Integer, Integer> i : hashMap.entrySet()) {
            if (i.getValue() > 1){
                flag = true;
            }
        }
        System.out.println("flag = " + flag);
    }
}
