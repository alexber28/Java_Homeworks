package org.example.figures;

public class Cone extends RoundedFigure{
    private double height;

    public Cone(double radius, double height) {
        super(Math.PI * radius * radius / 3, radius);
        this.height = height;
    }
}
