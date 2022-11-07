package org.example.flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowersShop {
    public static void main(String[] args) {
        List<Flower> bouquet = new ArrayList<>();

        Flower rose = new Rose(25, 7, "Red");
        Flower daisy = new Daisy(2, 10, "White", 10);
        Flower carnation = new Carnation(8, 9, "Red");
        Flower tulip = new Tulip(10, 4, "Purple");
        Flower lily = new Lily(15, 6, "Yellow");

        bouquet.add(rose);
        bouquet.add(daisy);
        bouquet.add(carnation);
        bouquet.add(tulip);
        bouquet.add(lily);

        System.out.println(bouquet);

        Flower.countPrice(bouquet);
        Flower.getAllColors(bouquet);
        Flower.getDaysBeforeWilt(bouquet);
    }
}
