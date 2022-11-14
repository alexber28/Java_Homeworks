package org.example.task3;

public class Vegetable extends Food{
    private String name;

    public Vegetable(FoodType foodType, String name) {
        super(foodType);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public FoodType getFoodType() {
        return this.foodType;
    }
}
