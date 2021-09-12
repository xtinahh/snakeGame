package model;

import java.util.ArrayList;
import java.util.List;

// Represent a snake with its length increasing as it consumes food moving at a default speed
public class Snake extends GameObject {
    private int x_Pos;
    protected int y_Pos;
    private int SPEED;
    private Body head;
    private List<Body> length;

    // EFFECTS: creates a snake with one length in the middle of the stage
    public Snake() {
        length = new ArrayList<Body>();
        length.add(new Body());
        x_Pos = MAX_X / 2;
        y_Pos = MAX_Y / 2;
    }

    public int getLength() {
        return length.size();
    }

    public int getX_Pos() {
        return x_Pos;
    }

    public int getY_Pos() {
        return y_Pos;
    }

    // MODIFIES: this
    // EFFECTS: increases the length of the snake by one
    public void grow() {
        length.add(new Body());
    }

    // MODIFIES: this
    // EFFECTS: changes direction of snake 90 degrees to the right
    public void rotateRight() {

    }

    // MODIFIES: this
    // EFFECTS: changes direction of snake 90 degrees to the left
    public void rotateLeft() {

    }

//    // MODIFIES: this
//    // EFFECTS: reduces the length of the snake by one
//    public void shrink() {
//        // consider scenarios where there is only one length left
//        length.remove(0);
//    }

    // EFFECTS: produces true if snake crossed the boundary
    public Boolean crossedBoundary() {
        // TODO: consider scenarios where snake is moving along the boundary
        return ((x_Pos == MIN_X) || (x_Pos == MAX_X) ||
                (y_Pos == MIN_Y) || (y_Pos == MAX_Y));
    }


}
