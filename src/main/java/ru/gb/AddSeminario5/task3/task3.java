package ru.gb.AddSeminario5.task3;

import java.util.HashMap;
import java.util.Map;

public class task3 {
    public static void main(String[] args) {
        Map<Character, Integer> rims = new HashMap<>(Map.of(
                'I', 1,
                'V',5,
                'X',10,
                'L',50,
                'C',100,
                'D',500,
                'M',1000));
//        String s = "LVIII";
//        Integer sum = 0;
//        for (int i = 0; i < s.length(); i++) {
//            sum += rims.get(s.charAt(i));
//        }
//        System.out.println("sum = " + sum);
        String s = "MCMXCIV";
        Integer sum = rims.get(s.charAt(s.length() - 1));
        for (int i = 0; i < s.length() - 1; i++) {
            if (rims.get(s.charAt(i)) < rims.get(s.charAt(i + 1))){
                sum -= rims.get(s.charAt(i));
            } else {
                sum += rims.get(s.charAt(i));
            }
        }
        System.out.println("sum = " + sum);
    }
}
