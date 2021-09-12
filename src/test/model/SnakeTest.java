package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static model.SnakeGame.STAGE_COLS;
import static model.SnakeGame.STAGE_ROWS;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SnakeTest {
    private Snake snake;

    @BeforeEach
    void setUp() {
        snake = new Snake(new Section(STAGE_COLS/2, STAGE_ROWS/2));
    }

    @Test
    void testSnakeConstructor() {
        assertEquals(1, snake.getLength());
    }

}