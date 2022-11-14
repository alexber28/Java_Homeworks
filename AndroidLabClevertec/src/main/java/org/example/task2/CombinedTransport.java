package org.example.task2;

public class CombinedTransport extends Transport{
    public static final int COST_OF_TECHNICAL_INSPECTION = 400;
    public static final int TRIPS_BEFORE_INSPECTION = 6;

    private int volumeOfTrunk;
    private int occupiedVolume;
    private int loadCapacity;
    private int occupiedCapacity;
    private TrunkType trunkType;
    private int passengerCapacity;
    private int currentCapacity;

    public CombinedTransport(int yearOfRelease, String manufacturer, FuelSupply fuel,
                             int fuelConsumption, int volumeOfTrunk, int loadCapacity,
                             TrunkType trunkType) {
        super(yearOfRelease, manufacturer, fuel, fuelConsumption);
        this.volumeOfTrunk = volumeOfTrunk;
        this.occupiedVolume = 0;
        this.loadCapacity = loadCapacity;
        this.occupiedCapacity = 0;
        this.trunkType = trunkType;
        this.passengerCapacity = 0;
        this.currentCapacity = 0;
    }

    @Override
    public String toString() {
        return "CombinedTransport{" + super.toString() +
                ", volumeOfTrunk=" + volumeOfTrunk +
                ", occupiedVolume=" + occupiedVolume +
                ", loadCapacity=" + loadCapacity +
                ", occupiedCapacity=" + occupiedCapacity +
                ", trunkType=" + trunkType +
                ", passengerCapacity=" + passengerCapacity +
                ", currentCapacity=" + currentCapacity +
                "}\n";
    }

    @Override
    public void refuel() {

    }

    @Override
    public void repair() {

    }

    @Override
    public boolean isReadyForWork() {
        return false;
    }

    @Override
    public void goWork() {

    }

    public void technicalInspection() {} //реализовать тут

    public boolean isCargoOrderLoaded(Order order) {return false;} //реализовать тут

    public int getEmptySpace() {
        return this.loadCapacity - this.occupiedCapacity;
    }

    public int getEmptyVolume() {
        return this.volumeOfTrunk - this.occupiedVolume;
    }

    public boolean isPassengerOrderLoaded(Order order) {return false;} //реализовать тут

    public int numberOfAvailableSeats() {
        return this.passengerCapacity - this.currentCapacity;
    }
}
