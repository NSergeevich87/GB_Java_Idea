package ru.gb.Unit_tests_seminar_4;

import  java.util.List;
import static org.mockito.Mockito.*;

public class Mockito {
    public static void main(String[] args) {
        List mockedList = mock(List.class);

        mockedList.add("one");
        System.out.println(mockedList.get(0));
        mockedList.clear();

        // создаем мок
        List<String> mockedList2 = mock(List.class);

        // используем мок
        mockedList2.add("one");
        mockedList2.clear();

        // проверяем, что методы были вызваны
        verify(mockedList2).add("one");
        verify(mockedList2).clear();
    }
}
