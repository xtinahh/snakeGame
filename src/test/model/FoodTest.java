package model;

import org.junit.jupiter.api.Test;

import static model.SnakeGame.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FoodTest {

    @Test
    void testFoodConstructorNutrition() {
        for (int i = 0; i < 100; i++) {
            Food food = new Food(INITIAL);
            assertTrue(food.getNutrition() >= food.MIN_NUT);
            assertTrue(food.getNutrition() <= food.MAX_NUT);
        }
    }

    @Test
    void testFoodConstructorPosition() {
        for (int i = 0; i < 100; i++) {
            Food food = new Food(INITIAL);
            Section position = food.getPosition();
            assertTrue(position.getColumn() >= 0);
            assertTrue(position.getColumn() < STAGE_COLS);
            assertTrue(position.getRow() >= 0);
            assertTrue(position.getRow() < STAGE_ROWS);
        }
    }
}