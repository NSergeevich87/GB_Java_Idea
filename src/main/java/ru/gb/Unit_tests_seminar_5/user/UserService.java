package ru.gb.Unit_tests_seminar_5.user;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserName(int id) {
        return userRepository.getUserById(id);
    }
}
