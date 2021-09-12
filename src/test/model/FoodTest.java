package model;

import org.junit.jupiter.api.Test;

import static model.SnakeGame.STAGE_COLS;
import static model.SnakeGame.STAGE_ROWS;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FoodTest {

    @Test
    void testFoodConstructor() {
        Section section = new Section(STAGE_COLS, STAGE_ROWS);
        for (int i = 0; i < 50; i++) {
            Food food = new Food(section);
            assertTrue(food.getNutrition() >= 1);
            assertTrue(food.getNutrition() <= 3);
        }
    }

}