package ru.gb.oop.seminario4.controller;

import ru.gb.oop.seminario4.data.User;

import java.time.LocalDate;

public class NewUserController implements IUserController{
    @Override
    public void create(String firstName, String surName, String lastName){
        User newUser = new User(firstName, lastName, surName, LocalDate.now());

    }
}
