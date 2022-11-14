package org.example.task2;

public class Main {
    public static void main(String[] args) {
        Transport travelBus = new CombinedTransport(1998, "BMW", FuelSupply.GAS, 9, 100, 150, TrunkType.AWNING_TRUNK);
        Transport bus = new PassengerTransport(2010, "Audi", FuelSupply.PETROL, 7, 60);
        Transport truck = new CargoTransport(2005, "Volvo", FuelSupply.DIESEL, 5, 120, 200, TrunkType.REFRIGERATOR);

        Park.transports.add(bus);
        Park.transports.add(truck);
        Park.transports.add(travelBus);

        Order order1 = new Order("2", "1", 1500, 10, 15, OrderType.FOOD);
        Order order2 = new Order("1", "2", 890, 10, 15, OrderType.MANUFACTURED_GOODS);
        Order order3 = new Order("3", "4", 1000, 10, 15, OrderType.LIQUID);
        Order order4 = new Order("4", "3", 2500, 10, 15, OrderType.FOOD);

        ((CargoTransport)truck).loadOrder(order1);
        ((CargoTransport)truck).loadOrder(order2);
        ((CargoTransport)truck).loadOrder(order3);
        ((CargoTransport)truck).loadOrder(order4);

        truck.listOfAllOrders();

        Park.startWork();

        System.out.println("Profit: " + Park.profit);
        System.out.println("Expenses: " + Park.expenses);

        Order.viewAllOrders();
    }
}
