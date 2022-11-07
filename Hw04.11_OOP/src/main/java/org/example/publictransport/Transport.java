package org.example.publictransport;

public abstract class Transport {
    private int numberOfRoute;
    private int numberOfSeats;
    private int hoursToWorkPerDay;
    private int costOfService;
    private int costOfMachine;
    private int costPerDay;
    private int costPerHour;
    private int maximalNumberOfWorksBeforeService;
    private int maximalNumberOfWorksBeforeWash;
    private String numberOfMachine;
    private boolean readyForWork;
    private int tasksDone;

    public Transport(int numberOfRoute, int numberOfSeats, int hoursToWorkPerDay,
                     int costOfService, int costOfMachine, int costPerDay, int costPerHour,
                     int maximalNumberOfWorksBeforeService, int maximalNumberOfWorksBeforeWash,
                     String numberOfMachine, boolean readyForWork) {
        this.numberOfRoute = numberOfRoute;
        this.numberOfSeats = numberOfSeats;
        this.hoursToWorkPerDay = hoursToWorkPerDay;
        this.costOfService = costOfService;
        this.costOfMachine = costOfMachine;
        this.costPerDay = costPerDay;
        this.costPerHour = costPerHour;
        this.maximalNumberOfWorksBeforeService = maximalNumberOfWorksBeforeService;
        this.maximalNumberOfWorksBeforeWash = maximalNumberOfWorksBeforeWash;
        this.numberOfMachine = numberOfMachine;
        this.readyForWork = readyForWork;
        this.tasksDone = 0;
    }

    public boolean isReadyForWork() {
        return this.tasksDone < this.maximalNumberOfWorksBeforeService;
    };
    public abstract void goWork();

    public abstract void doService();

    public abstract void wash();

    public int getNumberOfRoute() {
        return numberOfRoute;
    }

    public void setNumberOfRoute(int numberOfRoute) {
        this.numberOfRoute = numberOfRoute;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getHoursToWorkPerDay() {
        return hoursToWorkPerDay;
    }

    public void setHoursToWorkPerDay(int hoursToWorkPerDay) {
        this.hoursToWorkPerDay = hoursToWorkPerDay;
    }

    public int getCostOfService() {
        return costOfService;
    }

    public void setCostOfService(int costOfService) {
        this.costOfService = costOfService;
    }

    public int getCostOfMachine() {
        return costOfMachine;
    }

    public void setCostOfMachine(int costOfMachine) {
        this.costOfMachine = costOfMachine;
    }

    public int getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(int costPerDay) {
        this.costPerDay = costPerDay;
    }

    public int getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(int costPerHour) {
        this.costPerHour = costPerHour;
    }

    public int getMaximalNumberOfWorksBeforeService() {
        return maximalNumberOfWorksBeforeService;
    }

    public void setMaximalNumberOfWorksBeforeService(int maximalNumberOfWorksBeforeService) {
        this.maximalNumberOfWorksBeforeService = maximalNumberOfWorksBeforeService;
    }

    public int getMaximalNumberOfWorksBeforeWash() {
        return maximalNumberOfWorksBeforeWash;
    }

    public void setMaximalNumberOfWorksBeforeWash(int maximalNumberOfWorksBeforeWash) {
        this.maximalNumberOfWorksBeforeWash = maximalNumberOfWorksBeforeWash;
    }

    public String getNumberOfMachine() {
        return numberOfMachine;
    }

    public void setNumberOfMachine(String numberOfMachine) {
        this.numberOfMachine = numberOfMachine;
    }

    public void setReadyForWork(boolean readyForWork) {
        this.readyForWork = readyForWork;
    }

    public int getTasksDone() {
        return tasksDone;
    }

    public void setTasksDone(int tasksDone) {
        this.tasksDone = tasksDone;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "numberOfRoute=" + numberOfRoute +
                ", numberOfSeats=" + numberOfSeats +
                ", hoursToWorkPerDay=" + hoursToWorkPerDay +
                ", costOfService=" + costOfService +
                ", costOfMachine=" + costOfMachine +
                ", costPerDay=" + costPerDay +
                ", costPerHour=" + costPerHour +
                ", maximalNumberOfWorksBeforeService=" + maximalNumberOfWorksBeforeService +
                ", maximalNumberOfWorksBeforeWash=" + maximalNumberOfWorksBeforeWash +
                ", numberOfMachine='" + numberOfMachine + '\'' +
                ", readyForWork=" + readyForWork +
                ", tasksDone=" + tasksDone +
                "}\n";
    }
}
