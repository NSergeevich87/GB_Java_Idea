package ru.gb.hw_last_semi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FirstMid firstMid = new FirstMid();
        SecondMid secondMid = new SecondMid();
        MidComparator midComparator = new MidComparator();

        List<Integer> first_list = new ArrayList<>();
        first_list.add(1);
        first_list.add(2);
        List<Integer> second_list = new ArrayList<>();
        second_list.add(1);
        second_list.add(2);

        double first_mid = firstMid.GetMidOfList(first_list);
        double second_mid = secondMid.GetMidOfList(second_list);
        String result = midComparator.CompareValues(first_mid, second_mid);

        System.out.println("Result: " + result);

        /*Creator firstList = new Creator();
        OtherCreator secondList = new OtherCreator();
        ListComparator listComparator = new ListComparator();
        PrintList printList = new PrintList();

        List<Integer> first = firstList.create_list_of_numbers();
        List<Integer> second = secondList.create_list_of_numbers();

        printList.Print_List(first);
        printList.Print_List(second);

        String result = listComparator.LetsCompare(first, second);
        System.out.println(result);*/
    }
}
