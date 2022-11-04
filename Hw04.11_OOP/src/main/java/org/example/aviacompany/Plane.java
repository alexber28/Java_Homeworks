package org.example.aviacompany;

public class Plane extends FlyingMachine{
    private int numberOfSeats;
    private int loadCapacity;
    private boolean isCargoPlane;

    public Plane(int flightRange, int numberOfSeats, int loadCapacity, boolean isCargoPlane) {
        super(flightRange);
        this.numberOfSeats = numberOfSeats;
        this.loadCapacity = loadCapacity;
        this.isCargoPlane = isCargoPlane;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "Plane{" + super.toString() +
                ", numberOfSeats=" + numberOfSeats +
                ", loadCapacity=" + loadCapacity +
                ", isCargoPlane=" + isCargoPlane +
                '}';
    }

}
