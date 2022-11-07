package org.example.publictransport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();
        List<Transport> workingDay = new ArrayList<>();
        workingDay.add(Park.transports.get(0));
        workingDay.add(Park.transports.get(3));
        workingDay.add(Park.transports.get(1));
//        workingDay.add(Park.transports.get(1));
//        workingDay.add(Park.transports.get(0));
//        workingDay.add(Park.transports.get(2));
//        workingDay.add(Park.transports.get(0));
//        workingDay.add(Park.transports.get(2));
//        workingDay.add(Park.transports.get(3));
//        workingDay.add(Park.transports.get(3));

        System.out.println("Monday:");
        System.out.println(workingDay);
        park.startWork(workingDay);

        workingDay.remove(workingDay.get(0));
        workingDay.remove(workingDay.get(1));
        workingDay.add(Park.transports.get(2));

        System.out.println("Tuesday:");
        System.out.println(workingDay);
        park.startWork(workingDay);

    }
}