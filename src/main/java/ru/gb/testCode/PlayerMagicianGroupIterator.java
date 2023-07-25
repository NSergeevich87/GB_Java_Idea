package ru.gb.testCode;

import java.util.Iterator;
import java.util.List;

public class PlayerMagicianGroupIterator implements Iterator<PlayerMagician> {
    private int counter;
    private final List<PlayerMagician> magicianList;
    public PlayerMagicianGroupIterator(PlayerMagicianGroup playerMagicianGroup){
        this.magicianList = playerMagicianGroup.getMagicianList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < magicianList.size() - 1;
    }

    @Override
    public PlayerMagician next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return magicianList.get(counter);
    }

    @Override
    public void remove() {
        magicianList.remove(counter);
    }
}
