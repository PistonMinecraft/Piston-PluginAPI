package org.pistonmc.api.food;

public interface Food {
    FoodType getFoodType();
    int getFoodLevel();
    void setFoodLevel();
}