package ru.gb.oop.seminario7.fabric;

public class GemGen extends ItemGen{
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
