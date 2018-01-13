package org.vistula.customer;

import org.junit.Test;
import org.vistula.basket.BasketItem;

import java.util.List;

public class CustomerTest {

    @Test
    public void isAdultBelowAge(List<BasketItem> basket){
        Customer Mateusz = new Customer("Mateusz","Kowalski", 17, basket);
        assert !Mateusz.isAdult();
    }
    @Test
    public void isAdultAboveAge(List<BasketItem> basket){
        Customer Pawel = new Customer("Paweł", "Kumanowski", 32, basket);
        assert Pawel.isAdult();
    }
    @Test
    public void isAdultEqualAge(List<BasketItem> basket){
        Customer Anna = new Customer("Anna", "Kowalska", 18, basket);
        assert Anna.isAdult();
    }

}
