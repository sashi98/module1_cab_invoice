package com.he.trainer.bootcamp;

public class CabInvoice {

    public static final int DIST_CHARGE_PER_KM = 10;
    public static final int WAITING_CHARGE_PER_MIN = 2;

    public int calculateFare(int distance, int waitingTimeInMin) {
        return (DIST_CHARGE_PER_KM * distance) + (WAITING_CHARGE_PER_MIN * waitingTimeInMin);
    }
}
