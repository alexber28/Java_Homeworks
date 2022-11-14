package org.example.task3;

public abstract class Food {
    public FoodType foodType;

    public Food(FoodType foodType) {
        this.foodType = foodType;
    }

    public abstract FoodType getFoodType();
}
