package org.example.task3;

public class Milk extends Food{
    public String name;

    public Milk(FoodType foodType, String name) {
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
