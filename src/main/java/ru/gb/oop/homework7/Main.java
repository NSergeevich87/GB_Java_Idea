package ru.gb.oop.homework7;

import ru.gb.oop.homework7.interfaces.CreateCalc;
import ru.gb.oop.homework7.logger.ConsoleLog;
import ru.gb.oop.homework7.logger.CreateLog;
import ru.gb.oop.homework7.view.UserViewConsole;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to my new calculator!\n");
        CreateCalc newCalc = new CreateLog(new ConsoleLog());
        UserViewConsole console = new UserViewConsole(newCalc);
        console.programStart();
    }
}
