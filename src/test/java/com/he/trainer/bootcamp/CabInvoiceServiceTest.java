package com.he.trainer.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class CabInvoiceServiceTest {

    @Disabled("This test can be ignored as fare calculation rule is changed and minimum 40rs fare policy applied.")
    @Test
    public void fare_should_be_10rs_for_1km_and_no_waiting_charges(){
        CabInvoiceService invoiceService = new CabInvoiceService();
        int fare = invoiceService.calculateFare(1, 0);
        Assertions.assertEquals(10, fare);
    }

    @Disabled("This test can be ignored as fare calculation rule is changed and minimum 40rs fare policy applied.")
    @Test
    public void fare_should_be_12rs_for_1km_and_1min_waiting_charges(){
        CabInvoiceService invoiceService = new CabInvoiceService();
        int fare = invoiceService.calculateFare(1, 1);
        Assertions.assertEquals(12, fare);
    }

    @Disabled("This test can be ignored as fare calculation rule is changed and minimum 40rs fare policy applied.")
    @Test
    public void fare_should_be_24rs_for_2km_and_2min_waiting_charges(){
        CabInvoiceService invoiceService = new CabInvoiceService();
        int fare = invoiceService.calculateFare(2, 2);
        Assertions.assertEquals(24, fare);
    }

    @Test
    public void fare_should_be_minimum_40rs(){
        CabInvoiceService invoice = new CabInvoiceService();
        int fare = invoice.calculateFare(2, 2);
        Assertions.assertEquals(40, fare);
    }

    @Test
    public void fare_should_be_50rs_for_4km_and_5min_waiting(){
        CabInvoiceService invoiceService = new CabInvoiceService();
        int fare = invoiceService.calculateFare(4, 5);
        Assertions.assertEquals(50, fare);
    }

    @Test
    public void fare_should_be_40rs_for_1Ride_of_1km_and_1min_waiting_charges(){
        Ride r1 = new Ride(1, 1);
        CabInvoiceService service = new CabInvoiceService();
        int fare = service.calculateRidesFare(Collections.singletonList(r1));
        Assertions.assertEquals(40, fare);
    }

    @Test
    public void fare_should_be_100rs_for_2Rides_each_ride_of_4km_and_5min_waiting(){
        Ride r1 = new Ride(4, 5);
        Ride r2 = new Ride(4, 5);
        CabInvoiceService service = new CabInvoiceService();
        int fare = service.calculateRidesFare(Arrays.asList(r1, r2));
        Assertions.assertEquals(100, fare);
    }
}
