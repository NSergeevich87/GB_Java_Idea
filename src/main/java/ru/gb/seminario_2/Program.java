package ru.gb.seminario_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        task1();
        System.out.println(task2());
    }

    static void task1(){
        int a = 12;
        double b = 14.5;
        String str = "AAA" + "BBB" + a + "CCC" + b + "DDD";

        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());

        String buff = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            buff += UUID.randomUUID();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Операция выполнена за " + (endTime - startTime) + "ms.");
    }

    static String task2(){
        String inputStr = "dsg543546GDGFS345rdhr.sdge45yfgcF.";
        int[] statistic = new int[26];
        int cA = 'a';
        int code;
        char c;
        for (int i = 0; i < inputStr.length(); i++) {
            c = inputStr.charAt(i);
            code = c;
            if (c >= 'a' && c <= 'z'){
                statistic[code - cA]++;
            }
            if (c == '.')
                break;
        }
        System.out.println("Результат работы приложения: ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < statistic.length; i++) {
            if (statistic[i] > 0) {
                char cc = (char) (i + cA);
                stringBuilder
                        .append(cc)
                        .append(statistic[i])
                        .append('\n');
            }
        }
        return stringBuilder.toString();
    }

    static void workFile() throws IOException {
        File logFile = new File("log.txt");
        FileWriter fileWriter = new FileWriter(logFile, true);
//        fileWriter.flush();
//        fileWriter.close();
    }
}

