package ru.gb.oop.homework2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    private final List<Actor> queue;
    boolean status = false;

    public Market(){
        this.queue = new ArrayList<>();
    }
    @Override
    public void takeInQueue(Actor actor){
        System.out.println(actor.getName() + " vstal/a v ochered");
        this.queue.add(actor);
    }
    @Override
    public void takeOrders(){
        for (Actor actor: queue) {
            if (!actor.isMakeOrder(status)){
                status = true;
                actor.setMakeOrder(status);
                System.out.println(actor.getName() + " sdelal zakaz");
            }
        }
    }
    @Override
    public void giveOrders(){
        for (Actor actor: queue) {
            if (actor.isMakeOrder(status)){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " poluchil svoy zakaz");
            }
        }
    }
    @Override
    public void releaseFromQueue(){
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor: queue) {
            if (actor.isTakeOrder(status)){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " vishel iz ocheredi");
            }
        }
        releaseFromMarket(releasedActors);
    }
    @Override
    public void acceptToMarket(Actor actor){
        System.out.println(actor.getName() + " prishel v magazin");
        takeInQueue(actor);
    }
    @Override
    public void releaseFromMarket(List<Actor> actors){
        for (Actor actor: actors) {
            System.out.println(actor.getName() + " vishel iz magazina");
            queue.remove(actor);
        }
    }
    @Override
    public void update(){
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}
