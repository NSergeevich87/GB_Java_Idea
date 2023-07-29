package ru.gb.AddHomework5.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //String phrase = "Начинать обучение, или не начинать обучение - вот в чем вопрос!";
        countWords(askString());
    }
    public static String askString(){
        System.out.println("Введите фразу: ");
        String phrase = scanner.nextLine();
        return phrase;
    }
    public static void countWords(String phrase){
        Map<String, Integer> wordsCounter = new HashMap<>();
        String newPhrase = phrase.toLowerCase();
        newPhrase = newPhrase.replaceAll("[,.!?-]", "");
        String[] parts = newPhrase.split(" ");

        for (int i = 0; i < parts.length; i++) {
            if (!wordsCounter.containsKey(parts[i])){
                wordsCounter.put(parts[i], 1);
            } else {
                wordsCounter.put(parts[i], wordsCounter.get(parts[i]) + 1);
            }
        }
        printText(wordsCounter);
    }
    public static void printText(Map<String, Integer> text){
        System.out.println(text.toString());
    }
}
