package ru.gb.oop.seminario1;
public abstract class Product {
    private String name;
    private Double price;
    public Product(String name, Double price){
        setName(name);
        setPrice(price);
    }
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(Double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + price +
                '}';
    }
}
