package ru.gb.oop.seminario2;

public class Program {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Petya");
        //Human human2 = new Human("Masha");
        market.acceptToMarket(human1);
        //market.acceptToMarket(human2);
        market.update();
    }
}
