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
}
