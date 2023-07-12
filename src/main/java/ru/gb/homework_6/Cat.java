package ru.gb.homework_6;

import java.util.Objects;

public class Cat {
    private String genero;
    private int tamaño;
    private  String color;

    // Прописываем геттор и сеттор.
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public int getTamaño(){
        return tamaño;
    }
    public void setTamaño(int tamaño){
        this.tamaño = tamaño;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    // Поведение по умолчанию.
    public Cat(){
        genero = "";
        tamaño = 1;
        color = "";
    }
    // Метод с 3мя полями.
    public Cat(String genero, int tamaño, String color){
        this.genero = genero;
        this.tamaño = tamaño;
        this.color = color;
    }
    public String getInfo(){
        return String.format("Раса: %s; Вес: %d; Цвет: %s", genero, tamaño, color);
    }
    /**
     * Пишу логику сравнения объектов.
     * */
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return genero == cat.genero && tamaño == cat.tamaño && color == cat.color;
    }
    /**
     * Удаляем дубликаты.
     * */
    public int hashCode(){
        return Objects.hash(genero, tamaño, color);
    }
    // Переопределение метода стринг для вывода информации.
    @Override
    public String toString() {
        return getInfo();
    }
}
