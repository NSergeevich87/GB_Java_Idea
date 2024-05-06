package SimpleClass;

public class Employee {
    public static enum Genders {
        MALE,
        FEMALE
    }
    private static final int CURRENT_YEAR = 2024;
    String name;
    String midName;
    String surName;
    String position;
    String phone;
    int salary;
    int birth;
    Genders gender;
    String month = "09";
    String day = "12";

    public Employee(String name, String midName, String surName,
                    String phone, String position, int salary, int birth, Genders gen) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birth = birth;
        this.gender = gen;
    }
    public void setGender(Genders gen) {
        this.gender = gen;
    }
    public Genders getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

//    public void setPosition(String position) {
//        this.position = position;
//    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

//    public void setSalary(int salary) {
//        this.salary = salary;
//    }

    public int getAge() {
        return CURRENT_YEAR - birth;
    }

    public long getDate() {
        String temp = Integer.toString(birth) + month + day;
        long result = 0;
        try {
            result = Long.parseLong(temp);
        } catch (NumberFormatException e) {
            System.err.println("Error parsing the string: " + temp);
        }
        return result;
    }

    public String compareTo(Employee o) {
        if (this.getDate() < o.getDate())
            return getName() + " mayor than " + o.getName();
        else if (this.getDate() > o.getDate())
            return getName() + " menor than " + o.getName();
        else
            return "the same age";
    }
}
