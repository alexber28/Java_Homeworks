package org.example.aviacompany;

public class Plane extends FlyingMachine{
    private boolean isCargoPlane;

    public Plane(int flightRange, int numberOfSeats, int loadCapacity, boolean isCargoPlane) {
        super(flightRange, numberOfSeats, loadCapacity);
        this.isCargoPlane = isCargoPlane;
    }

    @Override
    public String toString() {
        return "Plane{" + super.toString() +
                ", isCargoPlane=" + isCargoPlane +
                '}';
    }

}
