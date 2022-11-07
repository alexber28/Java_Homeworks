package org.example.publictransport;

public class FuelTransport extends Transport{
    private static final int MINIMAL_FUEL_REQUIRED = 3;

    private FuelSupply fuelSupply;

    public FuelTransport(int numberOfRoute, int numberOfSeats, int hoursToWorkPerDay,
                         int costOfService, int costOfMachine, int maximalNumberOfWorksBeforeService,
                         int maximalNumberOfWorksBeforeWash, String numberOfMachine,
                         boolean readyForWork, FuelSupply fuelSupply) {
        super(numberOfRoute, numberOfSeats, hoursToWorkPerDay, costOfService, costOfMachine, (fuelSupply.ordinal() + 1) * MINIMAL_FUEL_REQUIRED * hoursToWorkPerDay, (fuelSupply.ordinal() + 1) * MINIMAL_FUEL_REQUIRED, maximalNumberOfWorksBeforeService, maximalNumberOfWorksBeforeWash, numberOfMachine, readyForWork);
        this.fuelSupply = fuelSupply;
    }

    @Override
    public void goWork() {}

    @Override
    public void doService() {}

    @Override //реализовать тут
    public void wash() {
        System.out.println(this.getClass() + " is clean");
        Park.expenses += Park.COST_OF_WASH_FUEL;
    }
}
