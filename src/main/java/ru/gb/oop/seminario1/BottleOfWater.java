package ru.gb.oop.seminario1;
//Наследуем от Product
public class BottleOfWater extends Product{
    private Double volume;
    public Double getVolume(){
        return volume;
    }
    public void setVolume(Double volume){
        this.volume = volume;
    }
    public BottleOfWater(String name, Double price, Double volume){
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + super.getName() + '\'' +
                "price='" + super.getPrice() + '\'' +
                "volume=" + this.volume +
                '}';
    }
}
