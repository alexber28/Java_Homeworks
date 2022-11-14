package org.example.task3;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Food> dish = new ArrayList<>();

        Food beef = new Meat(FoodType.MEAT, "Beef");
        Food coconutMilk = new Milk(FoodType.MILK, "Coconut milk");
        Food milk = new Milk(FoodType.MILK, "Milk");
        Food lettuce = new Vegetable(FoodType.VEGETABLE, "Lettuce");

        dish.add(beef);
        dish.add(milk);
        dish.add(lettuce);

        if(Vegetarian.isVegetarian(dish)){
            System.out.println("This dish is vegetarian");
        } else {
            System.out.println("This dish is not vegetarian");
        }
    }
}
