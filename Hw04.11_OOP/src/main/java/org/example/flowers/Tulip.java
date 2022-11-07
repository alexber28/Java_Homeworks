package org.example.flowers;

public class Tulip extends Flower{

    public Tulip(int price, int daysBeforeWilt, String color) {
        super(price, daysBeforeWilt, color);
    }

    @Override
    public String toString() {
        return "Tulip{" + super.toString() + "}\n";
    }
}
