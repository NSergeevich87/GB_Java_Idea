package ru.gb.testCode;

public class Printer {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);

        //boolean status = true;
        if (true && !false) { System.out.println("Success1"); }
        if (true || false) { System.out.println("Success2"); }
        if (true && !true) { System.out.println("Success3"); }
        if (false || !true) { System.out.println("Success4"); }
    }
}
