package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static model.SnakeGame.STAGE_COLS;
import static model.SnakeGame.STAGE_ROWS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SnakeGameTest {
    SnakeGame snakeGame;

    @BeforeEach
    void setUp() {
        snakeGame = new SnakeGame();
    }

    @Test
    void testSnakeGameConstructor() {
        assertEquals(1, snakeGame.getSnakeLength());
        List<Section> snake = snakeGame.getSnakeBody();
        assertFalse(snake.contains(snakeGame.getFoodPosition()));
    }

    @Test
    void testRunCannotEat() {
        Section originalPos = new Section(STAGE_COLS - 2, STAGE_ROWS - 5);
        snakeGame.setFoodPosition(originalPos);
        snakeGame.run();
        assertEquals(originalPos, snakeGame.getFoodPosition());
        snakeGame.run();
        assertEquals(originalPos, snakeGame.getFoodPosition());
        snakeGame.run();
        assertEquals(originalPos, snakeGame.getFoodPosition());
    }

    @Test
    void testRunCanEat() {
        Section originalPos = new Section(STAGE_COLS / 2, STAGE_ROWS / 2 + 2);
        snakeGame.setFoodPosition(originalPos);
        assertEquals(1, snakeGame.getSnakeLength());
        snakeGame.run();
        assertEquals(originalPos, snakeGame.getFoodPosition());
        snakeGame.run();
        assertEquals(originalPos, snakeGame.getFoodPosition());
        snakeGame.run();
        assertFalse(originalPos.equals(snakeGame.getFoodPosition()));
        assertEquals(2, snakeGame.getSnakeLength());
    }

    @Test
    void testGameOverCannibalism() {

    }

    @Test
    void testGameOverOutOfBoundsRight() {

    }

    @Test
    void testGameOverOutOfBoundsLeft() {

    }

    @Test
    void testGameOverOutOfBoundsUp() {

    }

    @Test
    void testGameOverOutOfBoundsDown() {

    }

}