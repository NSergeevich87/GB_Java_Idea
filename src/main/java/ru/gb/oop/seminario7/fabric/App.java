package ru.gb.oop.seminario7.fabric;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) {
        List<ItemGen> generators = new ArrayList<ItemGen>();
        generators.add(new GemGen());
        generators.add(new GoldGen());
        Random rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            IGameItem item = generators.get(rnd.nextInt() % 2 == 0? 0 : 1).createItem();
            item.open();
        }
    }
}
