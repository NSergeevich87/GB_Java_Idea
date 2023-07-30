package ru.gb.AddHomework6;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static AllOrdenadores allOrdenadores = new AllOrdenadores();
    public static void main(String[] args) {
        Ordenador ordenador1 = new Ordenador(15.6, 8,16,512);
        Ordenador ordenador2 = new Ordenador(14.0, 6,8,512);
        Ordenador ordenador3 = new Ordenador(16.0, 12,32,1024);
        Ordenador ordenador4 = new Ordenador(17.0, 24,64,2048);
        Ordenador ordenador5 = new Ordenador(13.0, 6,8,512);

        allOrdenadores.addOrdenador(ordenador1);
        allOrdenadores.addOrdenador(ordenador2);
        allOrdenadores.addOrdenador(ordenador3);
        allOrdenadores.addOrdenador(ordenador4);
        allOrdenadores.addOrdenador(ordenador5);

        AskPerson();
    }
    public static void AskPerson(){
        boolean stopFlag = false;
        while (!stopFlag) {
            System.out.println();
            System.out.println("Введите цифру, соответствующую необходимому критерию поиска." +
                    "\n1 - Вывести на экран весь список компьютеров" +
                    "\n2 - Размер дисплея" +
                    "\n3 - Количество ядер процессора" +
                    "\n4 - Объем диска" +
                    "\n5 - Размер оперативной памяти" +
                    "\n6 - Выход");
            String answer = scanner.next();
            switch (answer){
                case "1":
                    allOrdenadores.Print();
                    break;
                case "2":
                    System.out.println("Введите размер дисплея:");
                    Double size = Double.valueOf(scanner.next());
                    allOrdenadores.FindPantallaForSize(size);
                    break;
                case "3":
                    System.out.println("Введите количество ядер процессора:");
                    Integer cores = Integer.valueOf(scanner.next());
                    allOrdenadores.FindQuantityOfCores(cores);
                    break;
                case "4":
                    System.out.println("Введите объем жесткого диска:");
                    Integer ssd = Integer.valueOf(scanner.next());
                    allOrdenadores.FindSpaceOfSSD(ssd);
                    break;
                case "5":
                    System.out.println("Введите объем оперативной памяти:");
                    Integer ram = Integer.valueOf(scanner.next());
                    allOrdenadores.FindSpaceOfRAM(ram);
                    break;
                case "6":
                    stopFlag = true;
                    break;
                default:
                    System.out.println("Введите значение корректно!");
                    break;
            }
        }
    }
}
