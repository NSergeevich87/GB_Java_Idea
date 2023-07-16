package ru.gb.oop.homework1;

import ru.gb.oop.seminario1.Product;
import ru.gb.oop.seminario1.VendingMachine;

import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private List<Product> products;
    public HotDrinksVendingMachine(List<Product> products){
        this.products = products;
    }
    public Product getProduct(String name){
        for (Product product: products){
            if (product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт с названием %s не найден.", name));
    }
    public HotDrink getProduct(String name, String temperature){
        for (Product product: products) {
            if (product instanceof HotDrink){
                if (product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getTemperature() == temperature){
                    return (HotDrink) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт с названием %s не найден.", name));
    }
    public boolean addProduct(List<Product> productList){
        if(products == null && productList == null){
            return false;
        }
        for (Product item: productList) {
            products.add(item);
        }
        return true;
    }
}
