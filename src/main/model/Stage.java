package model;

import java.util.ArrayList;
import java.util.List;

// Represents the stage where game events take place
public class Stage extends GameObject {
    private Snake snake;
    private List<Food> foodList;

    // EFFECTS: creates a new stage with a snake and empty foodList
    public Stage() {
        snake = new Snake();
        foodList = new ArrayList<>();
    }

}
