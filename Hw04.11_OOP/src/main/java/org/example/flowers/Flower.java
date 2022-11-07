package org.example.flowers;

import java.util.*;

public class Flower {
    private int price;
    private int daysBeforeWilt;
    private String color;

    public Flower(int price, int daysBeforeWilt, String color) {
        this.price = price;
        this.daysBeforeWilt = daysBeforeWilt;
        this.color = color;
    }

    @Override
    public String toString() {
        return "price=" + price +
                ", daysBeforeWilt=" + daysBeforeWilt +
                ", color='" + color;
    }

    public static void countPrice(List<Flower> bouquet) {
        int summary = 0;

        for (Flower flower :
                bouquet) {
            if(flower instanceof Daisy) {
                summary += ((Daisy) flower).getNumberOfFlowersInBranch() * flower.price;
            } else {
                summary += flower.price;
            }
        }

        System.out.println("Total price: " + summary);
    }

    public static void getAllColors(List<Flower> bouquet) {
        Set<String> colors = new HashSet<String>(); //Set - для того, чтобы цвета не повторялись

        for (Flower flower :
                bouquet) {
            colors.add(flower.color);
        }

        System.out.println(colors);
    }

    public static void getDaysBeforeWilt(List<Flower> bouquet) {
        int daysLeft = 0;

        for (Flower flower :
                bouquet) {
            if(flower.daysBeforeWilt > daysLeft) {
                daysLeft = flower.daysBeforeWilt;
            }
        }

        System.out.println("Days before wilt: " + daysLeft);
    }
}
