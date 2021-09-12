package model;

// Represents a snake game with its stage size STAGE_COLS * STAGE_ROWS
public class SnakeGame {
    public static final int STAGE_COLS = 12;
    public static final int STAGE_ROWS = 12;

    private Snake snake;
    private Food food;

    // EFFECTS: creates a new snake game with a snake in the middle of the stage and food in a random location
    public SnakeGame() {
        snake = new Snake(new Section(STAGE_COLS/2, STAGE_ROWS/2));
        // TODO: created food in random place
    }

    // EFFECTS: returns food in a random location other than where the snake is
    public Food createFood() {
        // TODO
    }

}
