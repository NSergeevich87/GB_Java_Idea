package ru.gb.Unit_tests_seminar_3.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
       if (user.isAuthenticate) {
           data.add(user);
       }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logoutAll() {
        for (int i = 0; i < data.size(); i++) {
            data.get(i).isAuthenticate = false;
        }
    }

    public void logoutAllButNotAdmin() {
        for (int i = 0; i < data.size(); i++) {
            if (!data.get(i).isAdmin) {
                data.remove(i);
            }
        }
    }
}