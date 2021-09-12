package model;

// Represents a stage with size STAGE_COLS * STAGE_ROWS
public class Stage {
    public static final int STAGE_COLS = 12;
    public static final int STAGE_ROWS = 12;

    private Snake snake;
    private Food food;

    // EFFECTS: creates a new stage with a snake and empty foodList
    public Stage() {
        snake = new Snake(new Section(STAGE_COLS/2, STAGE_ROWS/2));
        food = new Food();
    }

}
