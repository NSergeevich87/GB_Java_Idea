package ru.gb.practice.oop_herencia;

public class Program {
    public static void main(String[] args) {
        Student student1 = new Student("Daniil", "Nikiforov", 20, 3, 5.0);
        Student student2 = new Student("Nikita", "Nikiforov", 35, 7, 4.2);
        Aspirant aspirant1 = new Aspirant("Kseniia", "Volkova", 33, "шмотки это наше все", 5.0);
        Aspirant aspirant2 = new Aspirant("Denis", "Volkov", 42, "вино это просто", 3.3);

        System.out.println(student1);
        System.out.println(aspirant1);

        Person[] persons = {student1, student2, aspirant1, aspirant2};

        for (Person p: persons) {
            System.out.println(p.returnName() + " получает стипендию " + p.getScholarship() + "р.");
            p.Speak();
        }
    }
}
