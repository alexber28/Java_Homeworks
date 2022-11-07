package org.example.aviacompany;

public abstract class FlyingMachine implements Comparable<FlyingMachine> {
    private int flightRange;
    private int numberOfSeats;
    private int loadCapacity;

    public FlyingMachine(int flightRange, int numberOfSeats, int loadCapacity) {
        this.flightRange = flightRange;
        this.numberOfSeats = numberOfSeats;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "flightRange=" + flightRange +
                ", numberOfSeats=" + numberOfSeats +
                ", loadCapacity=" + loadCapacity;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public int compareTo(FlyingMachine o) {
        return this.flightRange - o.flightRange;
    }
}
