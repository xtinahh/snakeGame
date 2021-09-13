package model;

import java.util.List;
import java.util.Random;

// Represents a snake game with its stage size STAGE_COLS * STAGE_ROWS
public class SnakeGame {
    public static final int STAGE_COLS = 12;
    public static final int STAGE_ROWS = 12;
    public static final Section INITIAL = new Section(STAGE_COLS / 2, STAGE_ROWS / 2);

    private Random randomNumber = new Random();
    private Snake snake;
    private Food food;


    // EFFECTS: creates a new snake game with a snake in the middle of the stage and food in a random location
    public SnakeGame() {
        snake = new Snake(INITIAL);
        food = createFood();
    }

    // EFFECTS: returns head position of snake
    public Section getSnakeHead() {
        return snake.getHead();
    }

    // EFFECTS: returns list of positions of snake (head and body)
    public List<Section> getSnakeBody() {
        return snake.getBody();
    }

    // EFFECTS: returns head direction of snake
    public String getSnakeDirection() {
        return snake.getDirection();
    }

    // EFFECTS: returns length of snake (head and body)
    public int getSnakeLength() {
        return snake.getLength();
    }

    // EFFECTS: returns food position
    public Section getFoodPosition() {
        return food.getPosition();
    }

    // EFFECTS: returns food nutrition
    public int getFoodNutrition() {
        return food.getNutrition();
    }

    // REQUIRES: position is within the game
    // MODIFIES: this
    // EFFECTS: moves food to given section
    public void setFoodPosition(Section position) {
        food = new Food(position);
    }

    // REQUIRES: direction is one of UP, DOWN, LEFT, RIGHT
    // MODIFIES: this
    // EFFECTS: moves food to given section
    public void setSnakeDirection(String direction) {
        snake.setDirection(direction);
    }

    // REQUIRES: !gameOver()
    // MODIFIES: this
    // EFFECTS: move snake and if snake can eat food, eats it and new food is created at a random position
    public void run() {
        if (canEat()) {
            snake.changeHunger();
            snake.move();
            food = createFood();
        } else {
            snake.move();
        }
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

    // EFFECTS: produces true if game is over
    public Boolean gameOver() {
        return snake.cannibalism() || outOfBounds();
    }

    // EFFECTS: produces true if snake can eat food
    public Boolean canEat() {
        return snake.getHead().equals(food.getPosition());
    }

    // EFFECTS: produces true if snake head is outside the game stage
    private Boolean outOfBounds() {
        Section position = snake.getHead();
        return position.getColumn() < 0 || position.getColumn() > STAGE_COLS ||
                position.getRow() < 0 || position.getRow() > STAGE_ROWS;
    }

    // EFFECTS: returns food in a random location other than where the snake is
    private Food createFood() {
        Section randomSection = randomSection();
        List<Section> body = snake.getBody();

        while (body.contains(randomSection) && snake.getHead().equals(randomSection)){
            randomSection = randomSection();
        }

        return new Food(randomSection);
    }

    // Code to generate random int references https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
    // EFFECTS: returns a section in a random location
    private Section randomSection() {
        return new Section (randomNumber.nextInt(STAGE_COLS), randomNumber.nextInt(STAGE_ROWS));
    }
}
