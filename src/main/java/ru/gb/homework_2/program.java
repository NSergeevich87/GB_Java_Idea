package ru.gb.homework_2;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.util.logging.Logger;

public class program {
    static Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = Logger.getLogger(program.class.getName());
    public static void main(String[] args) throws IOException{
        boolean stop = false;
        while (stop == false) {
            System.out.println("Введите номер задачи '1-4' или 'q' для выхода из приложения:");
            String answer = scanner.nextLine();
            switch (answer) {
                case "1":
                    task1();
                    break;
                case "2":
                    task2();
                    break;
                case "3":
                    task3();
                    break;
                case "4":
                    task4();
                    break;
                case "q":
                    stop = true;
                    break;
                default:
                    System.out.println("Нет такой задачи!");
            }
        }
    }
    static void task1(){
        System.out.println("Вы запустили задачу 1!");
        System.out.println("Параметры для фильтрации: {\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
        System.out.println("Введите значение WHERE - (name, country, city или age)");
        String where = scanner.nextLine();

        String name = "Ivanov";
        String country = "Russia";
        String city = "Moscow";
        String age = null;

        StringBuilder sb = new StringBuilder();
        if (where.equals("name") && name != null) {
            StringBuilder append = sb.append(name);
        }
        if (where.equals("country") && country != null) {
            sb.append(country);
        }
        if (where.equals("city") && city != null) {
            sb.append(city);
        }
        if (where.equals("age") && age != null) {
            sb.append(age);
        }

        System.out.println(sb.toString());
    }
    static void task2() throws IOException {
        System.out.println("Вы запустили задачу 2!");
        System.out.println("Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.");

        int[] arr = {0,9,8,8,7,6,6,5,3,4,5,6,0,9,8,1,2,3,4,5};
        ArrayPrint(arr);
        int[] newArr = SortBubbleWriter(arr);
        ArrayPrint(newArr);

        System.out.println("Результат можно постмотреть в файле 'task2LogFile.txt'");
    }
    static void task3(){
        System.out.println("Вы запустили задачу 3!");
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        System.out.println("Будем парсить эту JSON строку:");
        System.out.println(jsonString);
        ParseStr(jsonString);
    }
    static void task4() throws IOException {
        System.out.println("Вы запустили задачу 4!");
        System.out.println("Добавляем логирование в наш простой калькулятор.");
        System.out.println("Все данные будут записаны в файл 'calculatorLog.txt'");

        File logFile = new File("calculatorLog.txt");
        FileWriter fileWriter = new FileWriter(logFile, true);

        System.out.println("Введите первое число: ");
        float num1 = scanner.nextFloat();

        System.out.println("Введите /, *, - или + : ");
        String operation = scanner.next();

        System.out.println("Введите второе число: ");
        float num2 = scanner.nextFloat();

        switch (operation){
            case "/":
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                fileWriter.write(num1 + " / " + num2 + " = " + (num1 / num2));
                fileWriter.append("\n");
                fileWriter.flush();
                LOGGER.info(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                fileWriter.write(num1 + " * " + num2 + " = " + (num1 * num2));
                fileWriter.append("\n");
                fileWriter.flush();
                LOGGER.info(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                fileWriter.write(num1 + " - " + num2 + " = " + (num1 - num2));
                fileWriter.append("\n");
                fileWriter.flush();
                LOGGER.info(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                fileWriter.write(num1 + " + " + num2 + " = " + (num1 + num2));
                fileWriter.append("\n");
                fileWriter.flush();
                LOGGER.info(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            default:
                System.out.println("Введенное значение не соответствует требуемому!");
        }
    }
    static int[] SortBubbleWriter(int[] collection) throws IOException {
        int size = collection.length;

        File logFile = new File("task2LogFile.txt");
        FileWriter fileWriter = new FileWriter(logFile, true);

        for (int i = 0; i < size - 1; i++)
        {

            for (int j = 0; j < size - 1; j++)
            {
                if (collection[j] > collection[j + 1])
                {
                    final String s = Integer.toString(collection[j + 1]);
                    fileWriter.write(s);
                    fileWriter.append(' ');
                    fileWriter.flush();

                    int temp = collection[j];
                    collection[j] = collection[j + 1];
                    collection[j + 1] = temp;
                }
            }
        }
        return collection;
    }
    static void ArrayPrint(int[] collection){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < collection.length; i++) {
            sb.append(collection[i]);
        }
        System.out.println(sb);
    }
    public static void ParseStr(String jsonString){
        JSONArray jsonArray = new JSONArray(jsonString);

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String lastName = jsonObject.getString("фамилия");
            String grade = jsonObject.getString("оценка");
            String subject = jsonObject.getString("предмет");
            System.out.println(lastName + " " + grade + " " + subject);
        }
    }
}
