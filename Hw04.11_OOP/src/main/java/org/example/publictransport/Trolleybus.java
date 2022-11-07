package org.example.publictransport;

public class Trolleybus extends ElectricalTransport{

    public Trolleybus(int numberOfRoute, int numberOfSeats, int hoursToWorkPerDay,
                      int costOfService, int costOfMachine,
                      int maximalNumberOfWorksBeforeService, int maximalNumberOfWorksBeforeWash,
                      String numberOfMachine, boolean readyForWork, PowerSupply powerSupply) {
        super(numberOfRoute, numberOfSeats, hoursToWorkPerDay, costOfService, costOfMachine, maximalNumberOfWorksBeforeService, maximalNumberOfWorksBeforeWash, numberOfMachine, readyForWork, powerSupply);
    }

    @Override
    public void goWork() {
        System.out.println("Trolleybus went on a duty");
        Utils.sleep(3);
        setTasksDone(getTasksDone()+1);
    }

    @Override
    public void doService() {
        System.out.println("Service of a trolleybus is started");
        System.out.println("Cost of bus service: " + this.getCostOfService());
        Park.expenses += this.getCostOfService();
        Utils.sleep(3);
        setTasksDone(0);
    }

}
