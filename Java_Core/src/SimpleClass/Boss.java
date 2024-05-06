package SimpleClass;

public class Boss extends Employee {
    private static final int CURRENT_YEAR = 2024;
    String name;
    String midName;
    String surName;
    String position = "Boss";
    String phone;
    int salary;
    int birth;
    String month = "09";
    String day = "12";
    public Boss(String name,
                String midName,
                String surName,
                String phone,
                String position,
                int salary,
                int birth) {
        super(name, midName, surName, phone, position, salary, birth);
    }

    public static void setSalary(Employee o, int salary) {
        if (o.getClass() == Boss.class) {
            System.out.println("Boss can't raise his salary!");
        }
        else {
            o.salary += salary;
        }
    }
}
