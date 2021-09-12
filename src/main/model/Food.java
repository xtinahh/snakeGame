package model;

// Represents food with expiry time, nutritional value, and coordinates in x and y direction
public class Food {
    private int expiry;
    private int DEF_EXP = 10;

    private int nutrition;
    private int MIN_NUT = 1;
    private int MAX_NUT = 3;

    private int x_Coor;
    protected int y_Coor;

    private String colour;


    // Code to generate random int references https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
    // EFFECTS: creates a new food with default expiry, random nutrition, and random x and y coordinates
    public Food() {
        expiry = DEF_EXP;
        nutrition = getRandomNut();
//        x_Coor = getRandomX();
//        y_Coor = getRandomY();
    }

    // EFFECTS: helper method to get a random value for nutrition
    private int getRandomNut() {
        int rangeNut = (MAX_NUT - MIN_NUT + 1);
        return (int)Math.floor(Math.random() * rangeNut + MIN_NUT);
    }

//    // EFFECTS: helper method to get a random value for x coordinate
//    private int getRandomX() {
//        int rangeX = (MAX_X - MIN_X + 1);
//        return (int)Math.floor(Math.random() * rangeX + MIN_X);
//    }
//
//    // EFFECTS: helper method to get a random value for y coordinate
//    private int getRandomY() {
//        int rangeY = (MAX_Y - MIN_Y + 1);
//        return (int)Math.floor(Math.random() * rangeY + MIN_Y);
//    }

}
