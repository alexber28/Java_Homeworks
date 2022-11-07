package org.example.publictransport;

import java.util.ArrayList;
import java.util.List;

public class Park {
    public static List<Transport> transports = new ArrayList<>();{
        transports.add(new Bus(1, 40, 8, 300, 28790, 1, 1, "57-34 AT-7", true, FuelSupply.AVERAGE));
        transports.add(new Trolleybus(2, 36, 6, 280, 32790, 1, 2, "55-03 AT-7", true, PowerSupply.HIGH));
        transports.add(new Minibus(3, 40, 8, 310, 29790, 3, 2, "47-24 AT-7", true, FuelSupply.AVERAGE));
        transports.add(new Tram(4, 36, 6, 290, 31790, 2, 3, "27-28 AT-7", true, PowerSupply.LOW));
    }

    public static int expenses = 0;
    public static int profit = 0;

    public static final int PRICE_BUS_TICKET = 75;
    public static final int PRICE_TROLLEYBUS_TICKET = 70;
    public static final int PRICE_MINIBUS_TICKET = 90;
    public static final int PRICE_TRAM_TICKET = 80;

    public static final int COST_OF_WASH_ELECTRICAL = 150;
    public static final int COST_OF_WASH_FUEL = 180;


    public void startWork(List<Transport> machine) {
        //System.out.println(machine.toString());
        for (Transport transport :
                machine) {
            if(transport instanceof Bus){
                profit += transport.getNumberOfSeats() * PRICE_BUS_TICKET;
            }
            if(transport instanceof Trolleybus){
                profit += transport.getNumberOfSeats() * PRICE_TROLLEYBUS_TICKET;
            }
            if(transport instanceof Minibus){
                profit += transport.getNumberOfSeats() * PRICE_MINIBUS_TICKET;
            }
            if(transport instanceof Tram){
                profit += transport.getNumberOfSeats() * PRICE_TRAM_TICKET;
            }
            expenses += transport.getCostPerDay();
            if (transport.isReadyForWork()) {
                transport.goWork();
            } else {
                transport.doService();
            }
            transport.wash();
        }

        System.out.println("Total expenses: " + expenses + "\tTotal income: " + profit);
        expenses = 0;
        profit = 0;
    }
}

