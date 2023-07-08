package ru.gb.homework_5;


import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] contacts = {
                "Иванов 89991112233",
                "Петров 89992223344",
                "Сидоров 89993334455",
                "Кузнецов 89994445566",
                "Смирнов 89995556677",
                "Попов 89996667788",
                "Васильев 89997778899",
                "Новиков 89998889900",
                "Соколов 89990001122",
                "Иванов 89991112334"
        };

        //String contacts = "Иванов 89991112233";
        PhoneBook pb = new PhoneBook();
        for (int i = 0; i < contacts.length; i++) {
            String[] parts = contacts[i].split(" ");
            pb.add(parts[0], parts[1]);
        }

        System.out.println("Добро пожаловать в записную книгу!");
        System.out.println("В ней уже записаны следующие контакты:\n\n" +
                "Иванов 89991112233\n" +
                "Петров 89992223344\n" +
                "Сидоров 89993334455\n" +
                "Кузнецов 89994445566\n" +
                "Смирнов 89995556677\n" +
                "Попов 89996667788\n" +
                "Васильев 89997778899\n" +
                "Новиков 89998889900\n" +
                "Соколов 89990001122\n" +
                "Иванов 89991112334");

        boolean stop = false;
        while (!stop){
            System.out.println();
            System.out.println("Если хотите добавить контакт -> введите 'add'");
            System.out.println("Если хотите найти номер по фамилии -> введите 'find'");
            System.out.println("Для выхода из приложения нажмите -> 'q'");
            String answer = scanner.nextLine();
            switch (answer) {
                case "add":
                    System.out.println("Через пробел, введите фамилию и номер телефона: ");
                    String data = scanner.nextLine();
                    String[] addData = data.split(" ");
                    pb.add(addData[0], addData[1]);
                    break;
                case "find":
                    System.out.println("Введите фамилию: ");
                    String surname = scanner.nextLine();
                    System.out.println("Номер/а тел. под фамилией " + surname);
                    System.out.println(pb.get(surname));
                    break;
                case "q":
                    stop = true;
                    break;
                default:
                    System.out.println("Ошибка ввода!");
            }
        }
    }
}
