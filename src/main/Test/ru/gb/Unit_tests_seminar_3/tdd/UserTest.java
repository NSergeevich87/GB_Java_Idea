package ru.gb.Unit_tests_seminar_3.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    @Test
    void UserCreation() {
        User user = new User("user_1", "qwer", false);
        assertTrue(user.authenticate("user_1", "qwer"));
    }

    @Test
    void UserCreationFalse() {
        User user = new User("user_2", "qwerty", false);
        assertFalse(user.authenticate("user_2", "qwer"));
    }

    @Test
    void userRepository() {
        UserRepository userRepository = new UserRepository();
        User user = new User("name", "pass", false);
        userRepository.addUser(user);
        assertFalse(userRepository.findByName(user.name));
    }

    @Test
    void userRepositoryNA() {
        UserRepository userRepository = new UserRepository();
        User user = new User("name", "pass", false);
        user.authenticate("name", "pass");
        userRepository.addUser(user);
        assertTrue(userRepository.findByName(user.name));
    }

    @Test
    void logoutAllButNotAdminTest() {
        UserRepository userRepository = new UserRepository();
        User user_1 = new User("NoAdmin", "123", false);
        User user_2 = new User("Admin", "1234", true);
        user_1.authenticate("NoAdmin", "123");
        user_2.authenticate("Admin", "1234");

        //userRepository.logoutAll();

        userRepository.addUser(user_1);
        userRepository.addUser(user_2);

        userRepository.logoutAllButNotAdmin();

        assertFalse(userRepository.findByName(user_1.name));
        assertTrue(userRepository.findByName(user_2.name));
    }
}