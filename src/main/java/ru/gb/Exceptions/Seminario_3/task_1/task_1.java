package ru.gb.Exceptions.Seminario_3.task_1;

import java.io.*;
import java.util.HashMap;

public class task_1 {
    static String fileName = "C:\\Users\\Professional\\Documents\\GeekBrains\\IntelliJ IDEA JAVA\\Lection_Java\\src\\main\\java\\ru\\gb\\Exceptions\\Seminario_3\\task_1\\list.txt";
    static String fileName2 = "C:\\Users\\Professional\\Documents\\GeekBrains\\IntelliJ IDEA JAVA\\Lection_Java\\src\\main\\java\\ru\\gb\\Exceptions\\Seminario_3\\task_1\\list2.txt";
    static HashMap<String, Integer> hashMap;
    public static void main(String[] args) {
        File file = new File(fileName);
        String line;
        hashMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            //StringBuilder stringBuilder = new StringBuilder();
            while ((line = br.readLine()) != null){
                //stringBuilder.append(line);
                String[] temp = line.split("=");
                checkLength(temp);
                saveFile(file, hashMap);
            }
            //System.out.println(stringBuilder.toString());

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void checkLength(String[] str){

        if (str[1].equals("?")){
            hashMap.put(str[0], str[0].length());
        } else {
            hashMap.put(str[0], Integer.parseInt(str[1]));
        }
    }

    private static void saveFile(File file, HashMap<String, Integer> data) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            for (String key : data.keySet()) {
                bufferedWriter.write(String.format("%s=%s%n", key, data.get(key)));
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
