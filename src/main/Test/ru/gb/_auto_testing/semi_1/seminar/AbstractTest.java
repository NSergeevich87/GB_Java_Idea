package ru.gb._auto_testing.semi_1.seminar;

import org.junit.jupiter.api.BeforeAll;

/**
 * абстрактный тест для игры BlackJack
 */
public abstract class AbstractTest {

    static Game game;

    @BeforeAll
    static void init() {
        game = new Game();
    }
}
