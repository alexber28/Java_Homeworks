package org.example.appliances;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Home {
    public static List<Device> devices = new ArrayList<>();

    public static void main(String[] args) {
        Device deviceOne = new Computer(350, "Dell", 512);
        Device deviceTwo = new DishWasher(120, "LG", new Time(3000));
        Device deviceThree = new TV(150, "Samsung", 80);

        devices.add(deviceOne);
        devices.add(deviceTwo);
        devices.add(deviceThree);

        deviceOne.turnOn();
        deviceThree.turnOn();

        System.out.println(deviceOne + "\n" + deviceTwo + "\n" + deviceThree);

        System.out.println("Power consumption: " + Device.powerConsumption(devices));

        Collections.sort(devices);
        System.out.println("Sorted by power:\n" + devices);

        Device.findDevice(devices, 140, 360);
    }
}
