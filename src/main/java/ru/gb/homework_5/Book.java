package ru.gb.homework_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book {
    private Map<String, List<String>> data;
    public Book(){
        data = new HashMap<>();
    }
    public void add(String name, String number){
        List<String> numbers = data.get(name);
        if (numbers == null){
            numbers = new ArrayList<>();
            data.put(name, numbers);
        }
        numbers.add(number);
    }
    public List<String> get(String name){
        return data.get(name);
    }
}
