package org.example.figures;

public class Cylinder extends RoundedFigure{
    private double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}
