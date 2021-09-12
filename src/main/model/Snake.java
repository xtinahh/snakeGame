package model;

import java.util.ArrayList;
import java.util.List;

// Represent a snake with its length increasing as it consumes food
public class Snake {
    private Section head;
    private List<Section> body;
    private String direction;

    // EFFECTS: creates a snake with a head with 0 body moving in the DOWN direction
    public Snake(Section position) {
        head = position;
        body = new ArrayList<Section>();
        direction = "DOWN";
    }

    // EFFECTS: returns head
    public Section getHead() {
        return head;
    }

    // EFFECTS: returns the length of snake (head and body)
    public int getLength() {
        return 1 + body.size();
    }

    // EFFECTS: returns direction of snake
    public String getDirection() {
        return direction;
    }

    // MODIFIES: this
    // EFFECTS: rotates snake 90 degrees to the right
    public void rotateRight() {
        // TODO
    }

    // MODIFIES: this
    // EFFECTS: rotates snake 90 degrees to the left
    public void rotateLeft() {
        // TODO
    }

    // MODIFIES: this
    // EFFECTS: snake moves one section in current direction and if food is consumed, body increases by one
    public void move() {
        // TODO: move head, add one section to body where head was, only remove last body if not growing
    }

}
