package model;

import java.util.ArrayList;
import java.util.List;

// Represent a snake with its length increasing as it consumes food
public class Snake extends GameObject {
    private Section head;
    private List<Section> body;
    private String direction;

    // EFFECTS: creates a snake with a head
    public Snake() {
        body = new ArrayList<Section>();
        body.add(new Section());
    }

    // EFFECTS: returns the length of snake (head and body)
    public int getLength() {
        return body.size();
    }

    // EFFECTS: returns direction of snake
    public String getDirection() {
        return direction;
    }

    // MODIFIES: this
    // EFFECTS: increases the length of tail by one
    public void grow() {
        body.add(new Section());
    }

    //    // MODIFIES: this
//    // EFFECTS: reduces the length of the snake by one
//    public void shrink() {
//        // consider scenarios where there is only one length left
//        length.remove(0);
//    }

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

    // EFFECTS: produces true if snake crossed the boundary
    public Boolean crossedBoundary() {
        // TODO: consider scenarios where snake is moving along the boundary
//        return ((x_Pos == MIN_X) || (x_Pos == MAX_X) ||
//                (y_Pos == MIN_Y) || (y_Pos == MAX_Y));
        return false;
    }


}
