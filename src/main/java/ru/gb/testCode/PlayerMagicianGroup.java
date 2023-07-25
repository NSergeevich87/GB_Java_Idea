package ru.gb.testCode;

import java.util.Iterator;
import java.util.List;

public class PlayerMagicianGroup implements Iterable<PlayerMagician>{
    private List<PlayerMagician> magicianList;
    public List<PlayerMagician> getMagicianList(){
        return magicianList;
    }
    public void setMagicianList(List<PlayerMagician> magicianList){
        this.magicianList = magicianList;
    }

    @Override
    public Iterator<PlayerMagician> iterator() {
        return new PlayerMagicianGroupIterator(this);
    }
}
