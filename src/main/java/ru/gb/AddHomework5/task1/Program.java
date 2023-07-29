package ru.gb.AddHomework5.task1;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        String[] data = {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        };

        FindDuble(data);
    }
    public static void FindDuble(String[] data){
        Map<String, Integer> people = new HashMap<>();
        for (String person: data) {
            String[] parts = person.split(" ");
            if (!people.containsKey(parts[0])){
                people.put(parts[0], 1);
            } else {
                people.put(parts[0], people.get(parts[0]) + 1);
            }
        }
        people.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
