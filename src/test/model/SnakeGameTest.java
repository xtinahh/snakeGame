package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

class SnakeGameTest {
    SnakeGame snakeGame;

    @BeforeEach
    void setUp() {
        snakeGame = new SnakeGame();
    }

    @Test
    void testSnakeGameConstructor() {
        List<Section> snake = snakeGame.getSnakePosition();
        assertFalse(snake.contains(snakeGame.getFoodPosition()));
    }

    @Test
    void testGameOverCannibalism() {

    }

    @Test
    void testGameOverOutOfBounds() {

    }

}