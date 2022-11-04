package org.example.aviacompany;

public class Helicopter extends FlyingMachine{
    private int numberOfSeats;
    private int loadCapacity;
    private boolean isForEmergency;


    public Helicopter(int flightRange, int numberOfSeats, int loadCapacity, boolean isForEmergency) {
        super(flightRange);
        this.numberOfSeats = numberOfSeats;
        this.loadCapacity = loadCapacity;
        this.isForEmergency = isForEmergency;
    }

    public Helicopter(int flightRange, int loadCapacity) {
        super(flightRange);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "Helicopter{" + super.toString() +
                ", numberOfSeats=" + numberOfSeats +
                ", loadCapacity=" + loadCapacity +
                ", isForEmergency=" + isForEmergency +
                '}';
    }


}
