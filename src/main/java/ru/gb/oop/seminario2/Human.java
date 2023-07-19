package ru.gb.oop.seminario2;

public class Human extends Actor {
    public Human(String name){
        super(name);
    }
    @Override
    String getName() {
        return super.getName();
    }
    @Override
    public void setMakeOrder(boolean status) {
        //isMakeOrder(status);
    }
    @Override
    public void setTakeOrder(boolean status) {
        //isTakeOrder(status);
    }

    @Override
    public boolean isMakeOrder() {
        return true;
    }

    @Override
    public boolean isTakeOrder() {
        return true;
    }

    //    @Override
//    public boolean isMakeOrder(boolean status) {
//        if (status) return true;
//        else return false;
//    }
//    @Override
//    public boolean isTakeOrder(boolean status) {
//        if (status) return true;
//        else return false;
//    }
}
