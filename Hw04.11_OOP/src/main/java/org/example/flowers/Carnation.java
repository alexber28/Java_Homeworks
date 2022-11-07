package org.example.flowers;

public class Carnation extends Flower{

    public Carnation(int price, int daysBeforeWilt, String color) {
        super(price, daysBeforeWilt, color);
    }

    @Override
    public String toString() {
        return "Carnation{" + super.toString() + "}\n";
    }
}
