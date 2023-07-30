package ru.gb.AddSeminario6.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task1 {
        public static void main(String[] args) {
            List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2));
            System.out.println("percent = " + getPercent(array));
        }

        /**
         * @param array массив хранящий неуникальныее элементы
         * @return процент уникальных элементов
         * @apiNote Дан массив чисел, посчитать процент уникальных чисел.
         * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
         */
        private static double getPercent(List<Integer> array) {
            return new HashSet<>(array).size() * 100 / array.size();
        }
    }
