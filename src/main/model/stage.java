package model;

import java.util.ArrayList;
import java.util.List;

// Represents the stage where game events take place
public class stage extends gameObject{
    private snake snake;
    private List<food> foodList;

    // EFFECTS: creates a new stage with a snake and empty foodList
    public stage() {
        snake = new snake();
        foodList = new ArrayList<>();
    }

}
