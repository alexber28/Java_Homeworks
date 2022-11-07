package org.example.appliances;

import java.util.List;

public abstract class Device implements Comparable<Device> {
    private int powerRequired;
    private boolean isConnected;
    private String manufacturer;

    public Device(int powerRequired, String manufacturer) {
        this.powerRequired = powerRequired;
        this.isConnected = false;
        this.manufacturer = manufacturer;
    }

    public void turnOn() {
        this.isConnected = true;
    }

    public void turnOff() {
        this.isConnected = false;
    }

    public int getPowerRequired() {
        return powerRequired;
    }

    public static int powerConsumption(List<Device> devices) {
        int summary = 0;

        for (Device device :
                devices) {
            if (device.isConnected) {
                summary += device.powerRequired;
            }
        }

        return summary;
    }

    @Override
    public String toString() {
        return "powerRequired=" + powerRequired +
                ", isConnected=" + isConnected +
                ", manufacturer='" + manufacturer;
    }

    @Override
    public int compareTo(Device o) {
        return this.powerRequired - o.powerRequired;
    }

    public static void findDevice(List<Device> devices, int lowerLevel, int higherLevel) {
        boolean flag = true;

        for (Device device:
             devices) {
            if(device.powerRequired > lowerLevel && device.powerRequired < higherLevel){
                System.out.println(device);
                flag = false;
            }
        }
        if(flag){
            System.out.println("There are no devices matching this parameters");
        }
    }
}
