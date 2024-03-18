package ru.gb.hw_last_semi;

public class MidComparator {
    public String CompareValues(double v1, double v2) {
        String result = "";

        if (v1 > v2) {
            result = "Первый список имеет большее среднее значение";
        } else if (v1 < v2) {
            result = "Второй список имеет большее среднее значение";
        } else {
            result = "Средние значения равны";
        }

        return result;
    }
}
