import SimpleClass.Boss;
import SimpleClass.Employee;
import SimpleClass.evenNums;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // home work 3

        Employee ivan = new Employee("Ivan", "Igorevich",
                "Ovchinnikov", "8(495)000-11-22",
                "developer", 50000, 1985);
        Employee andrey = new Employee("Andrey", "Viktorovich",
                "Bezrukov", "8(495)111-22-33",
                "fitter", 52000, 1973);
        Employee evgeniy = new Employee("Evgeniy", "Viktorovich",
                "Delfinov", "8(495)222-33-44",
                "project manager", 40000, 1963);
        Employee natalia = new Employee("Natalia", "Pavlovna",
                "Keks", "8(495)333-44-55",
                "senior developer", 90000, 1990);
        Employee tatiana = new Employee("Tatiana", "Sergeevna",
                "Krasotkina", "8(495)444-55-66",
                "accountant", 50000, 1983);

        Employee[] company = new Employee[6];
        company[0] = ivan;
        company[1] = andrey;
        company[2] = evgeniy;
        company[3] = natalia;
        company[4] = tatiana;

        // task_1
        // check date format
        System.out.println(ivan.getDate());

        // compare two dates
        System.out.println(ivan.compareTo(natalia));

        // task_2
        // create Boss
        Boss boss = new Boss("Nikita", "Sergeevich", "Nikiforov",
                "8(495)441-55-61", "department's Boss", 110000, 1987 );
        company[5] = boss;

        // check salary
        for (Employee person : company) {
            System.out.println(person.getName() + " has salary " + person.getSalary());
        }
        // increase salary to all employees
        for (Employee person : company) {
            boss.setSalary(person, 50000);
        }
        // check salary
        for (Employee person : company) {
            System.out.println(person.getName() + " has salary " + person.getSalary());
        }
    }
}
