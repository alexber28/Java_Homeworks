package org.example.task3;

import java.util.ArrayList;

public class Vegetarian {
    public static boolean isVegetarian(ArrayList<Food> foods){
        for (Food ingredient: foods) {
            if(ingredient.getFoodType() == FoodType.MEAT || ingredient.getFoodType() == FoodType.FISH || ingredient.getFoodType() == FoodType.MILK) {
                return false;
            }
        }
        return true;
    }
}
