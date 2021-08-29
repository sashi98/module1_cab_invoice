package com.he.trainer.bootcamp;

public class Invoice {
    private int rideCount;
    private int totalFare;

    public Invoice() {
    }

    public int getRideCount() {
        return rideCount;
    }

    public void setRideCount(int rideCount) {
        this.rideCount = rideCount;
    }

    public int getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(int totalFare) {
        this.totalFare = totalFare;
    }

    public float getAverageFare() {
        return Math.round((float)totalFare / rideCount);
    }
}
