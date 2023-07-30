package ru.gb.AddSeminario6.task4;

public class Task4 {
    public static void main(String[] args) {
//        Напишите интерфейс Converter для конвертации из градусов по Цельсию в
//        Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
//        для валидного перевода величин. Метод для конвертации назовите "convertValue".
        double temp = -273.0;
        Cels cels = new Cels();
        System.out.println(cels.convertValue(temp));
        Faren faren = new Faren();
        System.out.println(faren.convertValue(temp));
        Kelvin kelvin = new Kelvin();
        System.out.println(kelvin.convertValue(temp));
    }
}
