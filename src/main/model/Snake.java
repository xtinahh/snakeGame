package model;

import java.util.ArrayList;
import java.util.List;

// Represent a snake with its length increasing as it consumes food
public class Snake {
    public static final String UP = "up";
    public static final String DOWN = "down";
    public static final String LEFT = "left";
    public static final String RIGHT = "right";

    private Section head;
    private List<Section> body;
    private String direction;
    private Boolean full;


    // EFFECTS: creates a hungry snake with a head with 0 body moving in the DOWN direction
    public Snake(Section position) {
        head = position;
        body = new ArrayList<Section>();
        direction = DOWN;
        full = false;
    }

    // EFFECTS: returns head
    public Section getHead() {
        return head;
    }

    // EFFECTS: returns body
    public List<Section> getBody() {
        return body;
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
    // EFFECTS: changes snake hunger state from false to true and vice versa
    public void changeHunger() {
        if (full) {
            full = false;
        } else {
            full = true;
        }
    }

    // EFFECTS: produces true if snake's head is in the same position in any section of the body
    public Boolean cannibalism() {
        return body.contains(head);
    }

    // REQUIRES: direction is one of UP, DOWN, LEFT, RIGHT
    // MODIFIES: this
    // EFFECTS: changes direction of snake to given direction
    public void setDirection(String direction) {
        this.direction = direction;
    }

    // MODIFIES: this
    // EFFECTS: rotates snake 90 degrees to the right
    public void rotateRight() {
        switch(direction) {
            case LEFT:
                direction = UP;
                break;
            case UP:
                direction = RIGHT;
                break;
            case RIGHT:
                direction = DOWN;
                break;
            case DOWN:
                direction = LEFT;
                break;
        }
    }

    // MODIFIES: this
    // EFFECTS: rotates snake 90 degrees to the left
    public void rotateLeft() {
        switch(direction) {
            case LEFT:
                direction = DOWN;
                break;
            case UP:
                direction = LEFT;
                break;
            case RIGHT:
                direction = UP;
                break;
            case DOWN:
                direction = RIGHT;
                break;
        }
    }

    // MODIFIES: this
    // EFFECTS: moves snake one section in current direction and if full, body increases by one
    //          section and snake is hungry again
    public void move() {
        body.add(0, new Section(head.getColumn(), head.getRow()));
        if (!full) {
            body.remove(body.size() - 1);
        } else {
            changeHunger();
        }
        moveHead();
    }

    // MODIFIES: this
    // EFFECTS: moves head one section in current direction
    private void moveHead() {
        switch (direction) {
            case LEFT:
                head = new Section(head.getColumn() - 1, head.getRow());
                break;
            case UP:
                head = new Section(head.getColumn(), head.getRow() - 1);
                break;
            case RIGHT:
                head = new Section(head.getColumn() + 1, head.getRow());
                break;
            case DOWN:
                head = new Section(head.getColumn(), head.getRow() + 1);
                break;
        }
    }
}
