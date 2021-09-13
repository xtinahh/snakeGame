package ui;

import model.SnakeGame;

import javax.swing.*;

import static model.Section.SECTION_SIZE;
import static model.SnakeGame.STAGE_COLS;
import static model.SnakeGame.STAGE_ROWS;

// Represents the main frame where snake game is played
public class SnakeGameApp extends JFrame {
    private static final int WIDTH = STAGE_COLS * SECTION_SIZE;
    private static final int HEIGHT = STAGE_ROWS * SECTION_SIZE;

    private SnakeGame snakeGame;

    // EFFECTS: create a window where snake game can be played
    public SnakeGameApp() {
        super("Snake Game");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        snakeGame = new SnakeGame();
        // TODO: make snake
        // TODO: make food
    }

    public static void main(String[] args) {
        new SnakeGameApp();
    }
}
