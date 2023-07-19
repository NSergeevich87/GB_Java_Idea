package ru.gb.oop.homework2;

public class Program {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Vova");
        Human human2 = new Human("Oksana");
        Human human3 = new Human("Ivan");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
    }
}
