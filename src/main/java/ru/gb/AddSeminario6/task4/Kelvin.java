package ru.gb.AddSeminario6.task4;

public class Kelvin implements Converter{
    @Override
    public double convertValue(double baseTemp) {
        return baseTemp + 273.1;
    }
}
