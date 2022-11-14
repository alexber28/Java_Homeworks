package org.example.task2;

import java.util.ArrayList;

public abstract class Transport {
    private int transportId;
    private int yearOfRelease;
    private String manufacturer;
    private FuelSupply fuel;
    private int fuelConsumption;
    private int tasksDone;
    private ArrayList<Order> orders;

    private static int counter = 0;

    public Transport(int yearOfRelease, String manufacturer, FuelSupply fuel, int fuelConsumption) {
        this.yearOfRelease = yearOfRelease;
        this.manufacturer = manufacturer;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.tasksDone = 0;
        this.orders = new ArrayList<>();
        this.transportId = counter++;
    }

    @Override
    public String toString() {
        return "transportId=" + transportId +
                ", yearOfRelease=" + yearOfRelease +
                ", manufacturer='" + manufacturer + '\'' +
                ", fuel=" + fuel +
                ", fuelConsumption=" + fuelConsumption +
                ", tasksDone=" + tasksDone;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public FuelSupply getFuel() {
        return fuel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public abstract void refuel();
    public abstract void repair();
    public abstract boolean isReadyForWork();
    public abstract void goWork();

    public void resetAllOrders() {
        for (Order order:
             this.orders) {
            this.orders.remove(order);
        }
    }

    public void listOfAllOrders() {
        for (Order order:
                this.orders) {
            System.out.println(order);
        }
    }


}
