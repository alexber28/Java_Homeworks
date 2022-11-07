package org.example.publictransport;

public class ElectricalTransport extends Transport{
    private static final int MINIMAL_POWER_REQUIRED = 80;

    private PowerSupply powerSupply;

    public ElectricalTransport(int numberOfRoute, int numberOfSeats, int hoursToWorkPerDay,
                               int costOfService, int costOfMachine,
                               int maximalNumberOfWorksBeforeService, int maximalNumberOfWorksBeforeWash,
                               String numberOfMachine, boolean readyForWork, PowerSupply powerSupply) {
        super(numberOfRoute, numberOfSeats, hoursToWorkPerDay, costOfService, costOfMachine, (powerSupply.ordinal() + 1) * MINIMAL_POWER_REQUIRED * hoursToWorkPerDay, (powerSupply.ordinal() + 1) * MINIMAL_POWER_REQUIRED, maximalNumberOfWorksBeforeService, maximalNumberOfWorksBeforeWash, numberOfMachine, readyForWork);
        this.powerSupply = powerSupply;
    }

    @Override //в наследниках
    public void goWork() {

    }

    @Override //в наследниках
    public void doService() {}

    @Override //реализовать тут
    public void wash() {
        System.out.println(this.getClass() + " is clean");
        Park.expenses += Park.COST_OF_WASH_ELECTRICAL;
    }

}
