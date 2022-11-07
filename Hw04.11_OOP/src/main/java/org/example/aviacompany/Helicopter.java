package org.example.aviacompany;

public class Helicopter extends FlyingMachine{
    private boolean isForEmergency;


    public Helicopter(int flightRange, int numberOfSeats, int loadCapacity, boolean isForEmergency) {
        super(flightRange, numberOfSeats, loadCapacity);
        this.isForEmergency = isForEmergency;
    }

    public Helicopter(int flightRange, int loadCapacity) {
        super(flightRange, 0, loadCapacity);
    }

    @Override
    public String toString() {
        return "Helicopter{" + super.toString() +
                ", isForEmergency=" + isForEmergency +
                '}';
    }


}
