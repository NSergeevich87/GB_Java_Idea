package ru.gb.oop.seminario4.view;

import ru.gb.oop.seminario4.data.User;

import java.util.List;

public interface UserViewInterface<T extends User> {
    /**
     * Принцип единственной ответственности, данный интерфейс выполняет только один метод печати.
     * Принцип разделения интерфейса (ISP)
     */
    public void sendOnConsole(List<T> listT);
}
