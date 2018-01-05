package org.vistula.customer;

import org.junit.Test;

public class CustomerTest {

    @Test
    public void isAdult(){
        Customer Pawel = new Customer();
        Pawel.setAge(17);
        assert Pawel.isAdult() == false;
    }
    @Test
    public void isAdult1(){
        Customer Pawel = new Customer();
        Pawel.setAge(18);
        assert Pawel.isAdult() == true;
    }

}
