package ru.gb.oop.seminario2;

public abstract class Actor implements  ActorBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    String getName(){
        return this.name;
    }
    public Actor(String name){
        this.name = name;
    }
}
