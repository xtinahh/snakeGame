package model;

// Represents food with expiry time, nutritional value, and coordinates in x and y direction
public class Food extends GameObject {
    private int expiry;
    private int DEF_EXP = 10;

    private int value;
    private int MIN_VAL = 1;
    private int MAX_VAL = 3;

    private int x_Coor;
    protected int y_Coor;

    private String colour;


    // Code to generate random int references https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
    // EFFECTS: creates a new food with default expiry, random value, and random x and y coordinates
    public Food() {
        int rangeVal = (MAX_VAL - MIN_VAL + 1);
        int rangeX = (MAX_X - MIN_X + 1);
        int rangeY = (MAX_Y - MIN_Y + 1);

        int randomVal = (int)Math.floor(Math.random() * rangeVal + MIN_VAL);
        int randomX = (int)Math.floor(Math.random() * rangeX + MIN_X);
        int randomY = (int)Math.floor(Math.random() * rangeY + MIN_Y);

        expiry = DEF_EXP;
        value = randomVal;
        x_Coor = randomX;
        y_Coor = randomY;
    }
}
