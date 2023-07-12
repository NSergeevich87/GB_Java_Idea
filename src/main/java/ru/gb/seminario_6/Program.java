package ru.gb.seminario_6;

import java.util.*;

public class Program {

    private static  Random random = new Random();

    public static void main(String[] args) {

        task1();
        task2();

        Integer a = 10;
        StringBuilder str = new StringBuilder("AAA");
        sample(a, str);
        System.out.println(a);
        System.out.println(str);

        task4();
    }

    static void task4(){

        Fraction fraction1 = new Fraction();

        Fraction fraction2 = new Fraction(3, 4);
        fraction2.setNumerator(5);
        System.out.println(fraction2.getNumerator());
        fraction2.setDenominator(4);
        System.out.println(fraction1);
        System.out.println(fraction2);

        fraction1.plus(fraction2);
        // fraction1.plus(fraction2)
        System.out.printf("%s + %s = %s\n", fraction1, fraction2, Fraction.plus(fraction1, fraction2));

        HashSet<Fraction> hashSet = new HashSet<>();
        hashSet.add(new Fraction(3, 4));
        hashSet.add(new Fraction(-1, 2));
        hashSet.add(new Fraction(2, 5));
        hashSet.add(new Fraction(3, 4));
        hashSet.add(new Fraction(6, 8));
        hashSet.add(new Fraction(3, 4));
        System.out.println(new Fraction(3, 4).equals(new Fraction(3, 4)));

        System.out.println(hashSet);
    }



    static void sample(Integer x, StringBuilder s){
        x++;
        x++;
        s.append("BBB");
    }

    /**
     * Задача:
     * 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
     * 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set
     * вычислите процент уникальных значений в данном массиве
     * и верните его в виде числа с плавающей запятой.
     * Для вычисления процента используйте формулу:
     * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
     */
    public static  void task2(){
        Integer[] array = new Integer[100];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(25);
        }
        task3(array);
    }

    public static void task3(Integer[] array){
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(array));
        //hashSet.addAll(Arrays.asList(array));
        System.out.println("% уникальных чисел: " + (double)hashSet.size() * 100 / array.length);
    }

    public static void task1(){
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedList = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        int size = random.nextInt(10, 21);
        System.out.println("Общее кол-во элементов: " + size);
        System.out.print("Случайные числа: ");
        for (int i = 0; i < size; i++){
            int number = random.nextInt(-9, 10);
            System.out.printf("%d ", number);
            hashSet.add(number);
            linkedList.add(number);
            treeSet.add(number);
        }

        System.out.println();
        System.out.println("HashSet" + hashSet);
        System.out.println("LinkedHashSet" + linkedList);
        System.out.println("TreeSet" + treeSet);



    }

}
