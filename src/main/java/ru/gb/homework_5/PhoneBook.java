package ru.gb.homework_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> directory;

    public PhoneBook() {
        directory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        List<String> numbers = directory.get(lastName);
        if (numbers == null) {
            numbers = new ArrayList<>();
            directory.put(lastName, numbers);
        }
        numbers.add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return directory.get(lastName);
    }
}
