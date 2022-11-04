package org.example.figures;

public class RectangularBox extends Figure{
    private double sideOne;
    private double sideTwo;
    private double height;

    public RectangularBox(double sideOne, double sideTwo, double height) {
        super(sideOne * sideTwo * height);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.height = height;
    }


}
