package org.example.aviacompany;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    public static List<FlyingMachine> machines = new ArrayList<>();

    public static void main(String[] args) {
        startWork();
    }

    public static void startWork() {
        FlyingMachine machineOne = new Helicopter(4000, 8, 100, true);
        FlyingMachine machineTwo = new Plane(15000, 150, 230, false);
        FlyingMachine machineThree = new Quadrocopter(75, 15, true);

        machines.add(machineOne);
        machines.add(machineTwo);
        machines.add(machineThree);

        System.out.println(machineOne + "\n" + machineTwo + "\n" + machineThree);

        System.out.println("Total capacity: " + countTotalCapacity(machines));
        System.out.println("Overall number of seats: " + countTotalSeats(machines));

        Collections.sort(machines);
        System.out.println("After sort by flight range:\n" + machines);

        System.out.println("Find first parameters:");
        findMachine(machines, 14000, 100);

        System.out.println("Find second parameters:");
        findMachine(machines, 4000, 8);
    }

    public static int countTotalSeats(List<FlyingMachine> machines) {
        int summary = 0;

        for (FlyingMachine machine :
                machines) {
            if (machine instanceof Plane) {
                Plane temp = (Plane) machine;
                summary += temp.getNumberOfSeats();
            }

            if (machine instanceof Helicopter) {
                Helicopter temp = (Helicopter) machine;
                summary += temp.getNumberOfSeats();
            }
        }

        return summary;
    }

    private static int countTotalCapacity(List<FlyingMachine> machines) {
        int summary = 0;

        for (FlyingMachine machine :
                machines) {
            summary += machine.getLoadCapacity();
        }

        return summary;
    }

    public static void findMachine(List<FlyingMachine> machines, int flightRange, int numberOfSeats) {
        boolean flag = true;

        for (FlyingMachine machine:
             machines) {
            if(machine.getFlightRange() == flightRange && machine.getNumberOfSeats() == numberOfSeats) {
                flag = false;
                System.out.println(machine);
            }
        }

        if(flag){
            System.out.println("There is no flying machine matching this parameters");
        }
    }

}
