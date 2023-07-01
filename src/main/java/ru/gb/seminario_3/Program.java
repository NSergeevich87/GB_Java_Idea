package ru.gb.seminario_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Program {
    
    static Random random = new Random();
    static  ArrayList<ArrayList<String>> catalog = new ArrayList<>();
    public static void main(String[] args) {
        String person2 = "Nikita";

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Hello!");
        arrayList1.add(false);
        arrayList1.add(person2);
    
        task1();
        task2();
    }
    
    static void task1(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = random.nextInt(10, 21);
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(-9, 10));
        }
        System.out.println("so sortirovki " + arrayList);
        Collections.sort(arrayList);
        System.out.println("posle sortirovki " + arrayList);
    }

    static  void  task2(){
        addBook("poema", "book 1");
        addBook("poema", "book 2");
        addBook("poema", "book 3");
        addBook("piessa", "book 15");

        printCatalog();
    }

    static void addBook(String genre, String bookName){
        for (ArrayList<String> books: catalog){
            if (books != null && books.size() > 0 && books.get(0).equals(genre)){
                books.add(bookName);
                return;
            }
        }
        ArrayList<String> books = new ArrayList<>();
        books.add(genre);
        books.add(bookName);
        catalog.add(books);
    }

    static void printCatalog(){
        int i = 0;
        boolean f = true;
        while (f){
            f = false;
            for (ArrayList<String> books: catalog){
                if (books != null && books.size() > i){
                    f = true;
                    System.out.printf("%s\t\t", books.get(i));
                }
            }
            System.out.println();
            i++;
        }
    }
}
