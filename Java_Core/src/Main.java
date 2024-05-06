import SimpleClass.Boss;
import SimpleClass.Employee;
import SimpleClass.Shop;
import SimpleClass.evenNums;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static SimpleClass.Shop.checkGender;

public class Main {

    enum Parties{NONE, NEW_YEAR, MARCH_8, FEB_23}
    private static final Parties today = Parties.MARCH_8;
    private static void celebrate(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            switch (today) {
                case NEW_YEAR:
                    System.out.println(emp[i].getName() + ", happy New Year!");
                    break;
                case FEB_23:
                    if (emp[i].getGender() == Employee.Genders.MALE)
                        System.out.println(emp[i].getName() + ", happy February 23rd!");
                    break;
                case MARCH_8:
                    if (emp[i].getGender() == Employee.Genders.FEMALE)
                        System.out.println(emp[i].getName() + ", happy march 8th!");
                    break;
                default:
                    System.out.println(emp[i].getName() + ", celebrate this morning!");
            }
        }
    }

    public static void main(String[] args) {
        // Set employee

        Employee ivan = new Employee("Ivan", "Igorevich",
                "Ovchinnikov", "8(495)000-11-22",
                "developer", 50000, 1985, Employee.Genders.MALE);
        Employee andrey = new Employee("Andrey", "Viktorovich",
                "Bezrukov", "8(495)111-22-33",
                "fitter", 52000, 1973, Employee.Genders.MALE);
        Employee evgeniy = new Employee("Evgeniy", "Viktorovich",
                "Delfinov", "8(495)222-33-44",
                "project manager", 40000, 1963, Employee.Genders.MALE);
        Employee natalia = new Employee("Natalia", "Pavlovna",
                "Keks", "8(495)333-44-55",
                "senior developer", 90000, 1990, Employee.Genders.FEMALE);
        Employee tatiana = new Employee("Tatiana", "Sergeevna",
                "Krasotkina", "8(495)444-55-66",
                "accountant", 50000, 1983, Employee.Genders.FEMALE);

        // Set customers
        Shop shop;
        Shop.Customer ivanko = new Shop.Customer("Ivan", Shop.Genders.MALE, 20, "+1-222-333-44-55");
        Shop.Customer petro = new Shop.Customer("Petr", Shop.Genders.MALE, 30, "+2-333-444-55-66");
        Shop.Customer anka = new Shop.Customer("Anna", Shop.Genders.FEMALE, 26, "+3-444-555-66-77");

        Employee[] company = new Employee[5];
        company[0] = ivan;
        company[1] = andrey;
        company[2] = evgeniy;
        company[3] = natalia;
        company[4] = tatiana;

        Shop.Customer[] customers = new Shop.Customer[3];
        customers[0] = ivanko;
        customers[1] = petro;
        customers[2] = anka;

        // task_1 check employee and customers gender
        System.out.println("Task_1");
        checkGender(customers);
        for (Employee item : company) {
            System.out.println(item.getName() + " has gender: " + item.getGender());
        }
        System.out.println("\n");

        // task_2 happy holidays
        System.out.println("Task_2");
        celebrate(company);
    }
}

