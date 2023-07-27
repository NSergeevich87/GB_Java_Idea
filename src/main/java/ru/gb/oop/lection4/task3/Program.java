package ru.gb.oop.lection4.task3;

public class Program {
    public static void main(String[] args) {
        Figure figure = new Figure(5.5);
        System.out.println(figure.ploshadF());
        Pryamoug pryamoug = new Pryamoug(4.4, 3.3);
        System.out.println(pryamoug.ploshadF());
    }
}
