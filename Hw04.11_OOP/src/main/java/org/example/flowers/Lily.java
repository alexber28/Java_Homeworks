package org.example.flowers;

public class Lily extends Flower{

    public Lily(int price, int daysBeforeWilt, String color) {
        super(price, daysBeforeWilt, color);
    }

    @Override
    public String toString() {
        return "Lily{" + super.toString() + "}\n";
    }
}
