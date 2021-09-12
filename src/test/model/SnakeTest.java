package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SnakeTest {
    private Snake snake;

    @BeforeEach
    void setUp() {
        snake = new Snake();
    }

    @Test
    void testSnake() {
        assertEquals(1, snake.getLength());
    }

    @Test
    void testGrow() {

    }

}