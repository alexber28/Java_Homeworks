package org.example.task2;

import java.util.ArrayList;

public class Order {
    private String startingPoint;
    private String endingPoint;
    private int costOfOrder;
    private int id;
    private int volume;
    private int weight;
    private int numberOfPassengers;
    private OrderType orderType;
    private Transport transport;
    private boolean isDone;

    private static int counterId = 0;
    public static ArrayList<Order> allOrders = new ArrayList<>();

    public Order(String startingPoint, String endingPoint, int costOfOrder, int numberOfPassengers, Transport transport) {
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
        this.costOfOrder = costOfOrder;
        this.id = counterId++;
        this.numberOfPassengers = numberOfPassengers;
        this.transport = null;
        this.isDone = false;
        allOrders.add(this);
    }

    public Order(String startingPoint, String endingPoint, int costOfOrder,
                 int volume, int weight, OrderType orderType) {
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
        this.costOfOrder = costOfOrder;
        this.id = counterId++;
        this.volume = volume;
        this.weight = weight;
        this.orderType = orderType;
        this.transport = null;
        this.isDone = false;
        allOrders.add(this);
    }

    public int getCostOfOrder() {
        return costOfOrder;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public int getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public static void viewAllOrders() {
        for (Order order:
                allOrders) {
            System.out.println(order);
        }
    }
}
