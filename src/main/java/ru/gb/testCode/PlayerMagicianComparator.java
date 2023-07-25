package ru.gb.testCode;

import java.util.Comparator;

public class PlayerMagicianComparator implements Comparator<PlayerMagician> {
    @Override
    public int compare(PlayerMagician o1, PlayerMagician o2) {
        if (o1.getHealth() > o2.getHealth()){
            return (int) (o1.getHealth() - o2.getHealth());
        } else {
            return (int) (o2.getHealth() - o1.getHealth());
        }
    }
}
