package ru.gb.oop.lection4.task3;

public class Figure {
    private Double radius;
    public Figure(Double radius){
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    public Double ploshadF(){
        return 2 * 3.14 * radius;
    }
}
