package ru.gb.oop.seminario7.fabric;

public class GoldGen extends ItemGen{
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
