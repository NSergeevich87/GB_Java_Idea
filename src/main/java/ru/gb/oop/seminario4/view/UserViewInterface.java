package ru.gb.oop.seminario4.view;

import ru.gb.oop.seminario4.data.User;

import java.util.List;

public interface UserViewInterface<T extends User> {
    public void sendOnConsole(List<T> listT);
}
