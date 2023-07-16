package ru.gb.oop.homework1;

import ru.gb.oop.seminario1.BottleOfWater;
import ru.gb.oop.seminario1.BottleOfWaterVendingMachine;
import ru.gb.oop.seminario1.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        BottleOfWater bottleOfWater = new BottleOfWater("pivo", 50.0, 0.5);
        BottleOfWater bottleOfWater1 = new BottleOfWater("voda", 25.0, 0.2);
        HotDrink hotDrink = new HotDrink("kofe iz ada", 200.0, "200 gradusov");
        HotDrink hotDrink1 = new HotDrink("chai", 90.0, "5 gradusov");
        List<Product> productList = new ArrayList<>();
        productList.add(bottleOfWater);
        productList.add(bottleOfWater1);
        productList.add(hotDrink);
        productList.add(hotDrink1);
        BottleOfWaterVendingMachine bottleOfWaterVendingMachine = new BottleOfWaterVendingMachine(productList);
        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine(productList);
        System.out.println(hotDrinksVendingMachine.getProduct("pivo"));
    }
}
