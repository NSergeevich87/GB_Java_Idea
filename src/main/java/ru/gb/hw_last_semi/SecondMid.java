package ru.gb.hw_last_semi;

import java.util.List;

public class SecondMid {
    public double GetMidOfList(List<Integer> list) {
        double mid;
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        mid = sum / list.size();

        return mid;
    }
}
