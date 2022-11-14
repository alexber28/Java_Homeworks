package org.example.task2;

import java.util.ArrayList;

public class CargoTransport extends Transport{
    private static final int TRIPS_BEFORE_REPAIR = 10;
    private static final int TRIPS_BEFORE_WASH = 1;
    public static final int TRIPS_BEFORE_REFUEL = 2;
    public static final int COST_OF_REPAIR = 2500;
    public static final int COST_OF_WASH = 380;

    private int volumeOfTrunk;
    private int occupiedVolume;
    private int loadCapacity;
    private int occupiedCapacity;
    private TrunkType trunkType;
    private int tripsAfterWash;
    private int tripsAfterRepair;
    private int tripsAfterRefuel;

    public CargoTransport(int yearOfRelease, String manufacturer, FuelSupply fuel,
                          int fuelConsumption, int volumeOfTrunk,
                          int loadCapacity, TrunkType trunkType) {
        super(yearOfRelease, manufacturer, fuel, fuelConsumption);
        this.volumeOfTrunk = volumeOfTrunk;
        this.occupiedVolume = 0;
        this.loadCapacity = loadCapacity;
        this.occupiedCapacity = 0;
        this.trunkType = trunkType;
        this.tripsAfterRepair = 0;
        this.tripsAfterWash = 0;
        this.tripsAfterRefuel = 0;
    }

    @Override
    public String toString() {
        return "CargoTransport{" + super.toString() +
                ", volumeOfTrunk=" + volumeOfTrunk +
                ", occupiedVolume=" + occupiedVolume +
                ", loadCapacity=" + loadCapacity +
                ", occupiedCapacity=" + occupiedCapacity +
                ", trunkType=" + trunkType +
                "}\n";
    }

    @Override
    public void refuel() {
        System.out.println("Cargo transport is getting refueled");
        Park.expenses += FuelSupply.getCostPerLiter(getFuel()) * getFuelConsumption();
        tripsAfterRefuel = 0;
        Utils.sleep(2);
    }

    @Override
    public void repair() {
        System.out.println("Cargo transport is getting repaired");
        Park.expenses += COST_OF_REPAIR;
        tripsAfterRepair = 0;
        Utils.sleep(3);
    }

    public void wash() {
        System.out.println("Cargo transport is getting washed");
        Park.expenses += COST_OF_WASH;
        tripsAfterRepair = 0;
        Utils.sleep(1);
    }

    @Override
    public boolean isReadyForWork() { //реализовать тут
        if(tripsAfterRepair == TRIPS_BEFORE_REPAIR || tripsAfterWash == TRIPS_BEFORE_WASH || tripsAfterRefuel == TRIPS_BEFORE_REFUEL){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void goWork() {
        if(getOrders() != null) {
            for (Order order : getOrders()) {
                if (this.isReadyForWork()) {
                    doOrder(order);
                } else {
                    if (tripsAfterRepair == TRIPS_BEFORE_REPAIR) {
                        repair();
                    }
                    if (tripsAfterWash == TRIPS_BEFORE_WASH) {
                        wash();
                    }
                    if (tripsAfterRefuel == TRIPS_BEFORE_REFUEL) {
                        refuel();
                    }
                    doOrder(order);
                }
            }
        }
        System.out.println("Cargo transport ended working");
    }

    public void doOrder(Order order){
        ArrayList<Order> temp;

        occupiedVolume -= order.getVolume();
        occupiedCapacity -= order.getWeight();

        Park.profit += order.getCostOfOrder();

        order.setDone(true);
//        temp = getOrders();
//        temp.remove(order);
//        setOrders(temp);

        Utils.sleep(2);
    }

    public boolean loadOrder(Order order) {
        if(TrunkType.getOrderType(trunkType).contains(order.getOrderType()) &&
                (order.getWeight() < loadCapacity - occupiedCapacity) &&
                (order.getVolume() < volumeOfTrunk - occupiedVolume)) {

            ArrayList<Order> temp = new ArrayList<>();
            temp = getOrders();
            temp.add(order);
            setOrders(temp);

            order.setTransport(this);

            occupiedVolume += order.getVolume();
            occupiedCapacity += order.getWeight();

            System.out.println("Order to cargo transport added");
            return true;
        } else {
            System.out.println("This order does not meet the requirements");
            return false;
        }
    }

    public int getEmptySpace() {
        return this.loadCapacity - this.occupiedCapacity;
    }

    public int getEmptyVolume() {
        return this.volumeOfTrunk - this.occupiedVolume;
    }
}
