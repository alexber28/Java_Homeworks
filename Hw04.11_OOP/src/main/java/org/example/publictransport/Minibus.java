package org.example.publictransport;

public class Minibus extends FuelTransport{

    public Minibus(int numberOfRoute, int numberOfSeats, int hoursToWorkPerDay,
                   int costOfService, int costOfMachine,
                   int maximalNumberOfWorksBeforeService, int maximalNumberOfWorksBeforeWash,
                   String numberOfMachine, boolean readyForWork, FuelSupply fuelSupply) {
        super(numberOfRoute, numberOfSeats, hoursToWorkPerDay, costOfService, costOfMachine, maximalNumberOfWorksBeforeService, maximalNumberOfWorksBeforeWash, numberOfMachine, readyForWork, fuelSupply);
    }

    @Override
    public void goWork() {
        System.out.println("Minibus went on a duty");
        Utils.sleep(3);
        setTasksDone(getTasksDone()+1);
    }

    @Override
    public void doService() {
        System.out.println("Service of a Minibus is started");
        System.out.println("Cost of bus service: " + this.getCostOfService());
        Park.expenses += this.getCostOfService();
        Utils.sleep(1);
        setTasksDone(0);
    }
}
