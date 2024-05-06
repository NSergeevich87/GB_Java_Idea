package SimpleClass;

public class Shop {
    public enum Genders {
        MALE,
        FEMALE
    }
    public static class Customer {
        String name;
        Genders gender;
        int age;
        String phone;

        public Customer(String name, Genders gen, int age, String phone) {
            this.name = name;
            this.gender = gen;
            this.age = age;
            this.phone = phone;
        }
        @Override
        public String toString() {
            return "Customer{name='" + name + '\'' + ", age=" + age + ", phone='" + phone + "'}";
        }
    }
    public static void checkGender(Customer[] customers) {
        for (Customer c : customers) {
            if (c.gender == Genders.MALE) {
                System.out.println("Hi Mr. customer " + c.name + "!");
            }
            else {
                System.out.println("Hi Mrs. customer " + c.name + "!");
            }
        }
    }
    private static class Item {
        String name;
        int cost;
        public Item(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Item{name='" + name + "', cost=" + cost + "}";
        }
    }
    private static class Order {
        Customer customer;
        Item item;
        int amount;
        public Order(Customer customer, Item item, int amount) {
            this.customer = customer;
            this.item = item;
            this.amount = amount;
        }
        @Override
        public String toString() {
            return "Order{customer=" + customer + ", item=" + item + ", amount=" + amount + "}";
        }
    }
    public static class CustomerException extends RuntimeException {
        public CustomerException(String message) { super(message); }
    }
    public static class ProductException extends RuntimeException {
        public ProductException(String message) { super(message); }
    }
    public static class AmountException extends RuntimeException {
        public AmountException(String message) { super(message); }
    }
    private final static Customer[] people = {
            new Customer("Ivan", Genders.MALE, 20, "+1-222-333-44-55"),
            new Customer("Petr", Genders.MALE, 30, "+2-333-444-55-66")
    };
    private final static Item[] items = {
            new Item("Ball", 100),
            new Item("Sandwich", 1000),
            new Item("Table", 10000),
            new Item("Car", 100000),
            new Item("Rocket", 10000000)
    };
    private static Order[] orders = new Order[5];
    private static boolean isInArray(Object[] arr, Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(o)) return true;
        }
        return false;
    }
    public static Order buy(Customer who, Item what, int howMuch) {
        if (!isInArray(people, who)) throw new CustomerException("Unknown customer: " + who);
        if (!isInArray(items, what)) throw new ProductException("Unknown item: " + what);
        if (howMuch < 0 || howMuch > 100) throw new AmountException("Incorrect amount: " + howMuch);
        return new Order(who, what, howMuch);
    }
}