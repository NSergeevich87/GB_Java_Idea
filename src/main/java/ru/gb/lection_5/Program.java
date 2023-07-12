package ru.gb.lection_5;

import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String file = "";

        if (args.length == 0) {
            file = "input.txt";
        }
        else{
            file = args[0];
        }

        //Equation eq = new Equation();
        String result = FileReader(file);
        System.out.println(result);
    }

    public static String FileReader(String str){
        String answer = "Given the equation: ";
        String result = "Result: ";
        String form = "";

        int x;
        int y;
        int z;

        try(FileReader reader = new FileReader("input.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                answer += (char) c;
                form += (char) c;
                if (form.equals("?")){

                }
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        return answer + "\n" + result + "\n" + form;
    }
}
