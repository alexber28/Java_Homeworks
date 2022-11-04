package org.example.aviacompany;

public abstract class FlyingMachine implements Comparable<FlyingMachine> {
    private int flightRange;

    public FlyingMachine(int flightRange) {
        this.flightRange = flightRange;
    }

    @Override
    public String toString() {
        return "flightRange=" + flightRange;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public abstract int getLoadCapacity();

    public abstract int getNumberOfSeats();

    @Override
    public int compareTo(FlyingMachine o) {
        return this.flightRange - o.flightRange;
    }
}
