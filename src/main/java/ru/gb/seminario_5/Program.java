package ru.gb.seminario_5;

import java.util.*;

public class Program {

    public static void main(String[] args) {
        String[] data = {
                "123456 Иванов",
                "321456 Васильев",
                "234561 Петрова",
                "234432 Иванов",
                "654321 Иванов",
                "654321 Петрова",

        };

        String[] students = {
                "Григорьев Анатолий 4 5 2",
                "Фокин Глеб 1 5 2",
                "Шестаков Клим 4 3 2",
                "Хохлов Мартин 2 5 2",
                "Шубин Лазарь 4 5 2",
                "Гущина Арьяна 4 3 3",
                "Брагина Виоланта 2 5 2",
                "Афанасьева Екатерина 1 1 2",
                "Рыбакова Снежана 4 2 2",
                "Лазарева Алла 4 3 2",
                "Бирюков Владлен 4 5 2",
                "Копылов Панкратий 4 4 4",
                "Горбунов Рубен 4 5 3",
                "Лыткин Герман 1 5 2",
                "Соколов Орест 1 1 5"

                //...
        };

        //task1(data);
        task2(students);
    }

    /**
     *
     */
    public static void task2(String[] students){

        HashMap<Double, List<Student>> statistics = new HashMap<>();
        for (String student : students){
            String[] studentParts = student.split(" ");
            int a = Integer.parseInt(studentParts[2]);
            int b = Integer.parseInt(studentParts[3]);
            int c = Integer.parseInt(studentParts[4]);
            double r = (double) (a + b + c) / 3;
            Student st = new Student(studentParts[1], studentParts[0], r);
            if (statistics.containsKey(r)){
                statistics.get(r).add(st);
            }
            else {
                ArrayList<Student> lst = new ArrayList<>();
                lst.add(st);
                statistics.put(r, lst);
            }
        }

        RatingComparator ratingComparator = new RatingComparator();

        TreeMap<Double, List<Student>> sortedStatistics = new TreeMap<>(ratingComparator);
        sortedStatistics.putAll(statistics);

        System.out.println("ТОП3 худших средних баллов среди студентов:");
        int counter = 1;
        for (Map.Entry<Double, List<Student>> item : sortedStatistics.entrySet())
        {
            System.out.printf("%d место - средний балл %.3f\n", counter, item.getKey());
            for (Student student : item.getValue()){
                System.out.println("\t" + student);
            }
            counter++;
            if (counter > 3)
                break;
        }

    }

    /**
     * Задача:
     * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
     * 123456 Иванов
     * 321456 Васильев
     * 234561 Петрова
     * 234432 Иванов
     * 654321 Петрова
     * 345678 Иванов
     * Вывести данные по сотрудникам с фамилией Иванов.
     */
    public static void task1(String[] data){
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        HashMap<String, List<Integer>> hashMap2 = new HashMap<>();

        // Способ 1
        for (String person : data){
            String[] parts = person.split(" ");
            hashMap1.put(Integer.parseInt(parts[0]), parts[1]);
        }

        for (Map.Entry<Integer, String> element :  hashMap1.entrySet()){
            if (element.getValue().equals("Иванов"))
                System.out.println(element.getKey());
        }
        // Способ 2

        for (String person : data){
            String[] parts = person.split(" ");

            if (hashMap2.containsKey(parts[1])){
                List<Integer> lst = hashMap2.get(parts[1]);
                //List<Integer> lst2 = hashMap2.get(parts[1]);
                //List<Integer> lst3 = hashMap2.get(parts[1]);
                //List<Integer> lst4 = hashMap2.get(parts[1]);
                //List<Integer> lst5 = hashMap2.get(parts[1]);
                //List<Integer> lst6 = hashMap2.get(parts[1]);
                lst.add(Integer.parseInt(parts[0]));
                hashMap2.get(parts[1]).add(Integer.parseInt(parts[0]));

                //StringBuilder stringBuilder = new StringBuilder("AAA");
                //stringBuilder.append("BBB").append("AAA").append("asasss").append("aaaa");
            }
            else{
                ArrayList<Integer> lst = new ArrayList<>();
                lst.add(Integer.parseInt(parts[0]));
                hashMap2.put(parts[1], lst);
            }
        }

        List<Integer> lst = hashMap2.get("Иванов");
        if (lst != null){
            System.out.println(lst);
        }
    }

}
