package model;

import java.util.ArrayList;
import java.util.List;

// Represent a snake with its length increasing as it consumes food
public class Snake extends GameObject {
    private int SPEED;
    private List<Body> length;

    // EFFECTS: creates a snake with one length
    public Snake() {
        length = new ArrayList<Body>();
        length.add(new Body());
    }

    // MODIFIES: this
    // EFFECTS: increases the length of the snake by one
    public void grow() {
        length.add(new Body());
    }

    // MODIFIES: this
    // EFFECTS: reduces the length of the snake by one
    public void shrink() {
        // TODO: consider scenario where there is only one length left
        length.remove(0);
    }

}
