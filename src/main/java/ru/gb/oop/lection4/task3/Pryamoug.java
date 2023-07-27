package ru.gb.oop.lection4.task3;

public class Pryamoug {
    private Double sizeA;
    private Double sizeB;
    public Pryamoug(Double a, Double b){
        this.sizeA = a;
        this.sizeB = b;
    }

    public Double getSizeA() {
        return sizeA;
    }

    public void setSizeA(Double sizeA) {
        this.sizeA = sizeA;
    }

    public Double getSizeB() {
        return sizeB;
    }

    public void setSizeB(Double sizeB) {
        this.sizeB = sizeB;
    }
    public Double ploshadF(){
        return sizeA * sizeB;
    }
}
