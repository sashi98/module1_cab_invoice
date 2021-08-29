package com.he.trainer.bootcamp;

import com.he.trainer.bootcamp.CabInvoice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceTest {

    @Test
    public void fare_should_be_10rs_for_1km_and_no_waiting_charges(){
        CabInvoice invoice = new CabInvoice();
        int fare = invoice.calculateFare(1, 0);
        Assertions.assertEquals(10, fare);
    }

    @Test
    public void fare_should_be_12rs_for_1km_and_1min_waiting_charges(){
        CabInvoice invoice = new CabInvoice();
        int fare = invoice.calculateFare(1, 1);
        Assertions.assertEquals(12, fare);
    }

    @Test
    public void fare_should_be_24rs_for_2km_and_2min_waiting_charges(){
        CabInvoice invoice = new CabInvoice();
        int fare = invoice.calculateFare(2, 2);
        Assertions.assertEquals(24, fare);
    }
}
