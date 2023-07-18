package ru.gb.oop.seminario2;

public interface ActorBehaviour {
    void setMakeOrder(boolean status);
    void setTakeOrder(boolean status);
    boolean isMakeOrder();
    boolean isTakeOrder();
}
