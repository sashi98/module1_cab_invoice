package com.he.trainer.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

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


}
