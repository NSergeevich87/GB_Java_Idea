package ru.gb.testCode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Nikita!");

        PlayerMagician playerMagician1 = new PlayerMagician("Uber", 350, 500);
        PlayerMagician playerMagician2 = new PlayerMagician("Luber", 450, 400);

        PlayerMagicianComparator compare = new PlayerMagicianComparator();
        System.out.println(compare.compare(playerMagician1, playerMagician2));
    }
}
