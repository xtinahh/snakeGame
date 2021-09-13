package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static model.Snake.DOWN;
import static model.Snake.INITIAL_DIR;
import static model.SnakeGame.*;
import static org.junit.jupiter.api.Assertions.*;

class SnakeGameTest {
    SnakeGame snakeGame;

    @BeforeEach
    void setUp() {
        snakeGame = new SnakeGame();
    }

    @Test
    void testSnakeGameConstructorSnake() {
        assertEquals(INITIAL, snakeGame.getSnakeHead());
        assertEquals(1, snakeGame.getSnakeLength());
        assertEquals(0, snakeGame.getSnakeBody().size());
        assertEquals(INITIAL_DIR, snakeGame.getSnakeDirection());
    }

    @Test
    void testSnakeGameConstructorFood() {
        for (int i = 0; i > 100; i++) {
            List<Section> snake = snakeGame.getSnakeBody();
            assertFalse(snake.contains(snakeGame.getFoodPosition()));
            assertFalse(snakeGame.getSnakeHead().equals(snakeGame.getFoodPosition()));
        }
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
        assertFalse(snakeGame.gameOver());
        snakeGame.setSnakeDirection(DOWN);
        snakeGame.changeSnakeHunger();
        snakeGame.run();
        snakeGame.rotateSnakeRight();
        snakeGame.changeSnakeHunger();
        snakeGame.run();
        snakeGame.rotateSnakeRight();
        snakeGame.changeSnakeHunger();
        snakeGame.run();
        snakeGame.rotateSnakeRight();
        snakeGame.changeSnakeHunger();
        snakeGame.run();
        assertTrue(snakeGame.gameOver());
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