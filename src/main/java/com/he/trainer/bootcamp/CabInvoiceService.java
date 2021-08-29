package com.he.trainer.bootcamp;

import java.util.List;

public class CabInvoiceService {

    public static final int DIST_CHARGE_PER_KM = 10;
    public static final int WAITING_CHARGE_PER_MIN = 2;
    public static final int MINIMUM_FARE = 40;

    public int calculateFare(int distance, int waitingTimeInMin) {
        int fare = calculate(distance, waitingTimeInMin);
        if (fare < 40) {
            fare = MINIMUM_FARE;
        }
        return fare;
    }

    private int calculate(int distance, int waitingTimeInMin) {
        return (DIST_CHARGE_PER_KM * distance) + (WAITING_CHARGE_PER_MIN * waitingTimeInMin);
    }

    public int calculateRidesFare(List<Ride> rides) {
        int sum = 0;
        for (Ride ride : rides) {
            sum += calculateFare(ride.dist, ride.waitingTimeInMin);
        }
        return sum;
    }
}
