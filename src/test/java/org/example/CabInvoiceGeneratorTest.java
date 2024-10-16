package org.example;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    CabInvoiceGenerator cab = new CabInvoiceGenerator();

    @Test
    public void givendistanceFare() {
        double distance = 2.0;
        int time = 5;
        double actualvalue = cab.calculateFare(distance, time);
        int expectedvalue = 25;
        Assert.assertEquals(expectedvalue, actualvalue, 0);
    }

    @Test
    public void givendistanceFare2() {
        double distance = 2.0;
        int time = 5;
        double actualvalue = cab.calculateFare(distance, time);
        int expectedvalue = 25;
        Assert.assertEquals(expectedvalue, actualvalue, 0);
    }
}