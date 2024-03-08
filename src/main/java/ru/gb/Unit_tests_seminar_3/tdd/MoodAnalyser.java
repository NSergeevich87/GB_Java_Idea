package ru.gb.Unit_tests_seminar_3.tdd;

public class MoodAnalyser {

    public String analyseMood(String message) {

        if (message.contains(("Sad"))) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}