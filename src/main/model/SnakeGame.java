package model;

import java.util.List;
import java.util.Random;

// Represents a snake game with its stage size STAGE_COLS * STAGE_ROWS
public class SnakeGame {
    public static final int STAGE_COLS = 12;
    public static final int STAGE_ROWS = 12;

    Random randomNumb = new Random();
    private Snake snake;
    private Food food;


    // EFFECTS: creates a new snake game with a snake in the middle of the stage and food in a random location
    public SnakeGame() {
        snake = new Snake(new Section(STAGE_COLS/2, STAGE_ROWS/2));
        food = createFood();
    }

    // EFFECTS: returns the head position of snake
    public Section getSnakeHead() {
        return snake.getHead();
    }

    // EFFECTS: returns position of snake (head and body)
    public List<Section> getSnakePosition() {
        return snake.getPosition();
    }

    // EFFECTS: returns head position of snake
    public String getSnakeDirection() {
        return snake.getDirection();
    }

    // EFFECTS: returns food position
    public Section getFoodPosition() {
        return food.getPosition();
    }

    // EFFECTS: returns food nutrition
    public int getFoodNutrition() {
        return food.getNutrition();
    }

    // MODIFIES: this
    // EFFECTS: rotates snake 90 degrees to the right
    public void rotateSnakeRight() {
        snake.rotateRight();
    }

    // MODIFIES: this
    // EFFECTS: rotates snake 90 degrees to the left
    public void rotateSnakeLeft() {
        snake.rotateLeft();
    }

    // EFFECTS: returns food in a random location other than where the snake is
    private Food createFood() {
        Section randomSection = randomSection();
        List<Section> wholeSnake = snake.getPosition();

        while (wholeSnake.contains(randomSection)){
            randomSection = randomSection();
        }

        return new Food(randomSection);
    }

    // Code to generate random int references https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
    // EFFECTS: returns a section in a random location
    private Section randomSection() {
        Section randomSection = new Section (randomNumb.nextInt(STAGE_COLS), randomNumb.nextInt(STAGE_ROWS));
        return randomSection;
    }
}
