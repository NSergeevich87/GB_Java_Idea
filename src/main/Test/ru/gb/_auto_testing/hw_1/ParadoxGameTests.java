package ru.gb._auto_testing.hw_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class ParadoxGameTests {

    @Test
    public void TestPlayerRisk() {
        Player player_false = new Player("Player_1", false);
        Player player_true = new Player("Player_2", true);

        boolean result_true = player_true.getRisk();
        boolean result_false = player_false.getRisk();

        assertTrue(result_true);
        assertFalse(result_false);
    }

    @Test
    public void TestDoorPrize() {
        Door door_prize = new Door(true);
        Door door_no_prize = new Door(false);

        boolean is_no_prize = door_no_prize.isPrize();
        boolean is_prize = door_prize.isPrize();

        assertFalse(is_no_prize);
        assertTrue(is_prize);
    }

    @Test
    public void TestWinRiskFalse() {
        List<Door> tree_doors = new ArrayList<>();
        tree_doors.add(new Door(false));
        tree_doors.add(new Door(false));
        tree_doors.add(new Door(true));

        Player player = new Player("Cobarde", false);
        Game game = new Game(player, tree_doors);
        Door win_door = game.round(2);

        assertTrue(win_door.isPrize());
    }

    @Test
    public void TestWinRiskTrue() {
        List<Door> tree_doors = new ArrayList<>();
        tree_doors.add(new Door(false));
        tree_doors.add(new Door(false));
        tree_doors.add(new Door(true));

        Player player = new Player("Valiente", true);
        Game game = new Game(player, tree_doors);
        Door win_door = game.round(1);

        assertTrue(win_door.isPrize());
    }

    @Test
    public void TestLoseRiskTrue() {
        List<Door> tree_doors = new ArrayList<>();
        tree_doors.add(new Door(false));
        tree_doors.add(new Door(false));
        tree_doors.add(new Door(true));

        Player player = new Player("Valiente", true);
        Game game = new Game(player, tree_doors);
        Door win_door = game.round(2);

        assertFalse(win_door.isPrize());
    }

    @Test
    public void TestLoseRiskFalse() {
        List<Door> tree_doors = new ArrayList<>();
        tree_doors.add(new Door(false));
        tree_doors.add(new Door(false));
        tree_doors.add(new Door(true));

        Player player = new Player("Cobarde", false);
        Game game = new Game(player, tree_doors);
        Door win_door = game.round(1);

        assertFalse(win_door.isPrize());
    }
}
