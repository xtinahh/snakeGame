package model;

// Represents food with expiry time, nutritional value, and coordinates in x and y direction
public class food {
    private int expiry = 10;

    private int value;
    private int maxVal = 3;
    private int minVal = 1;

    private int xCoor;
    private int minX = 0;
    private int maxX = 0;

    private int yCoor;
    private int minY = 0;
    private int maxY = 0;


    // Codes to generate random int references https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
    // EFFECTS: creates a new food with default expiry, random value, and random x and y coordinates
    public food() {
        int rangeVal = (maxVal - minVal + 1);
        int rangeX = (maxX - minX + 1);
        int rangeY = (maxY - minY + 1);

        int randomVal = (int)Math.floor(Math.random() * rangeVal + minVal);
        int randomX = (int)Math.floor(Math.random() * rangeX + minX);
        int randomY = (int)Math.floor(Math.random() * rangeY + minY);

        value = randomVal;
        xCoor = randomX;
        yCoor = randomY;
    }
}
