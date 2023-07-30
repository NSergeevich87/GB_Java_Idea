package ru.gb.AddSeminario6.task4;

public class Faren implements Converter{
    @Override
    public double convertValue(double baseTemp) {
        return 1.8 * baseTemp + 32;
    }
}
