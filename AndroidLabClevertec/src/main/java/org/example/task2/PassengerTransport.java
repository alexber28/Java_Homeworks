package org.example.task2;

public class PassengerTransport extends Transport{
    public static final int TRIPS_BEFORE_DISINFECTION = 2;
    public static final int COST_OF_DISINFECTION = 30;
    public static final int COST_OF_REPAIR = 2100;

    private int passengerCapacity;
    private int currentCapacity;

    public PassengerTransport(int yearOfRelease, String manufacturer, FuelSupply fuel,
                              int fuelConsumption, int passengerCapacity) {
        super(yearOfRelease, manufacturer, fuel, fuelConsumption);
        this.passengerCapacity = passengerCapacity;
        this.currentCapacity = 0;
    }

    @Override
    public String toString() {
        return "PassengerTransport{" +  super.toString() +
                ", passengerCapacity=" + passengerCapacity +
                ", currentCapacity=" + currentCapacity +
                "}\n";
    }

    @Override
    public void refuel() { //реализовать тут

    }

    @Override
    public void repair() { //реализовать тут

    }

    @Override
    public boolean isReadyForWork() { //реализовать тут
        return false;
    }

    @Override
    public void goWork() {

    }

    public void disinfectTransport() { //реализовать тут

    }

    public boolean isOrderLoaded(Order order) {return false;} //реализовать тут

    public int numberOfAvailableSeats() {
        return this.passengerCapacity - this.currentCapacity;
    }
}
