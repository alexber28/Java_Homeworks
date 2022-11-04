package org.example.aviacompany;

public class Quadrocopter extends Helicopter{
    private boolean isForDelivery;

    public Quadrocopter(int flightRange, int loadCapacity, boolean isForDelivery) {
        super(flightRange, loadCapacity);
        this.isForDelivery = isForDelivery;
    }

    @Override
    public String toString() {
        return "Quadrocopter{" +
                "flightRange=" + super.getFlightRange() +
                ", numberOfSeats=" + super.getNumberOfSeats() +
                ", loadCapacity=" + super.getLoadCapacity() +
                ", isForDelivery=" + isForDelivery +
                '}';
    }
}
