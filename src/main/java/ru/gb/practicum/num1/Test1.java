package ru.gb.practicum.num1;

public class Test1 {
    private String name;
    private int size;
    private int weight;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int sumSizeWeight(){
        return size + weight;
    }
    public int maxNumero(){
        if (size > weight) return size;
        else return weight;
    }

    @Override
    public String toString() {
        return "Test1: " +
                "name = " + name +
                " size = " + size;
    }
}
