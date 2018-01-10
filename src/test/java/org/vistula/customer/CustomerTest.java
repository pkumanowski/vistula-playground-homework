package org.vistula.customer;

import org.junit.Test;

public class CustomerTest {

    @Test
    public void isAdult(){
        Customer Mateusz = new Customer("Mateusz","Kowalski", 17);
        assert !Mateusz.isAdult();
    }
    @Test
    public void isAdult1(){
        Customer Pawel = new Customer("Paweł", "Kumanowski", 32);
        assert Pawel.isAdult();
    }

}
