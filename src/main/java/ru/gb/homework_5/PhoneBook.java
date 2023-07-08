package ru.gb.homework_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> data;

    public PhoneBook() {
        data = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        List<String> numbers = data.get(lastName);
        if (numbers == null) {
            numbers = new ArrayList<>();
            data.put(lastName, numbers);
        }
        numbers.add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return data.get(lastName);
    }
}
