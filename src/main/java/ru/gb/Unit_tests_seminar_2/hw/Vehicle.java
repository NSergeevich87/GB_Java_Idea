package ru.gb.Unit_tests_seminar_2.hw;

public abstract class Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public abstract void testDrive();

    public abstract void park();
}
