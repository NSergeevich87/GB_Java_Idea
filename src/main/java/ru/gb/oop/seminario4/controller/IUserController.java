package ru.gb.oop.seminario4.controller;

import ru.gb.oop.seminario4.data.User;

public interface IUserController <T extends User>{
    void create(String firstName, String surName, String lastName);
}
