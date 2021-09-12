package model;

import java.util.ArrayList;

// Represent a snake with its length increasing as it consumes food
public class snake extends gameObject{
    private int SPEED;
    private List<body> length;

    // EFFECTS: creates a snake with one length
    public snake() {
        length = new ArrayList<body>();
        length.addBody();
    }
}
