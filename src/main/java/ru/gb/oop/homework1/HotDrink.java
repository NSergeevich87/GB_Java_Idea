package ru.gb.oop.homework1;

import ru.gb.oop.seminario1.Product;

public class HotDrink extends Product {
    private String temperature;

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
    public String getTemperature(){
        return temperature;
    }
    public HotDrink(String name, Double price, String temperature){
        super(name, price);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                "price='" + super.getPrice() + '\'' +
                "temperature='" + this.temperature +
                '}';
    }
}
