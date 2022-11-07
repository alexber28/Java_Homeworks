package org.example.figures;

public class RoundedFigure extends Figure{
    private double radius;

    public RoundedFigure(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
