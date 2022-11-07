package org.example.flowers;

public class Rose extends Flower{

    public Rose(int price, int daysBeforeWilt, String color) {
        super(price, daysBeforeWilt, color);
    }

    @Override
    public String toString() {
        return "Rose{" + super.toString() + "}\n";
    }
}
