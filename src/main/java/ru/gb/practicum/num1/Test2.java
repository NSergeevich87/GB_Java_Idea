package ru.gb.practicum.num1;

public class Test2 {
    private String name;
    private String typeOfEngine;
    private Double sizeOfEngine;
    private int forceOfEngine;
    public Test2(){
        name = "Edsel";
        typeOfEngine = "Petrol";
        sizeOfEngine = 2.0;
        forceOfEngine = 249;
    }
    public Test2(String name, String typeOfEngine, Double sizeOfEngine, int forceOfEngine){
        this.name = name;
        this.typeOfEngine = typeOfEngine;
        this.sizeOfEngine = sizeOfEngine;
        this.forceOfEngine = forceOfEngine;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public Double getSizeOfEngine() {
        return sizeOfEngine;
    }

    public void setSizeOfEngine(Double sizeOfEngine) {
        this.sizeOfEngine = sizeOfEngine;
    }

    public int getForceOfEngine() {
        return forceOfEngine;
    }

    public void setForceOfEngine(int forceOfEngine) {
        this.forceOfEngine = forceOfEngine;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "name='" + name + '\'' +
                ", typeOfEngine='" + typeOfEngine + '\'' +
                ", sizeOfEngine=" + sizeOfEngine +
                ", forceOfEngine=" + forceOfEngine +
                '}';
    }
}
