package ru.gb.AddSeminario5.task1;

import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        //1)Посчитать количество вхождений каждого символа в текст.
        Map<Character, Integer> hashMap = new HashMap<>();
        String str = "qwweee asd ";
//        hashMap.putIfAbsent(str.charAt(i), 0);
//        hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
        for (int i = 0; i < str.length(); i++) {
            if (!hashMap.containsKey(str.charAt(i))) {
                hashMap.put(str.charAt(i), 1);
            } else {
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
            }
        }

        for (Map.Entry<Character, Integer> element : hashMap.entrySet()) {
            System.out.println("символ - "+element.getKey()+" = "+ element.getValue());
        }

    }
}
