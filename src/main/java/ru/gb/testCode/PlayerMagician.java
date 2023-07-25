package ru.gb.testCode;

public class PlayerMagician extends Player implements Comparable<PlayerMagician>{
    private String name;
    private Integer health;
    private Integer mana;
    public PlayerMagician(String name, int health, int mana){
        this.name = name;
        this.health = health;
        this.mana = mana;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public long getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    @Override
    public void move() {
        super.move();
        System.out.println("Я передвигаюсь вперед!");
    }
    @Override
    public int compareTo(PlayerMagician o){
        return this.health.compareTo(o.health);
    }
}
