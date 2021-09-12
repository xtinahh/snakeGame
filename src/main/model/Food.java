package model;

// Represents food with expiry time, nutritional value, and coordinates in x and y direction
public class Food {
    private int MIN_NUT = 1;
    private int MAX_NUT = 3;

    private int nutrition;
    private Section position;


    // Code to generate random int references https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
    // EFFECTS: creates a new food with default expiry, random nutrition, and random x and y coordinates
    public Food(Section position) {
        nutrition = getRandomNut();
        this.position = position;
    }

    // EFFECTS: helper method to get a random value for nutrition
    private int getRandomNut() {
        int rangeNut = (MAX_NUT - MIN_NUT + 1);
        return (int)Math.floor(Math.random() * rangeNut + MIN_NUT);
    }

    public int getNutrition() {
        return nutrition;
    }

    public Section getPosition() {
        return position;
    }

}
