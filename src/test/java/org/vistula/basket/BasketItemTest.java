package org.vistula.basket;

import org.junit.Test;

public class BasketItemTest {
    @Test
    public void isRestricted(){
        BasketItem vodka = new BasketItem(200, true);
        assert vodka.isAgeRestrictedItem() == true;
    }
    @Test
    public void canBuyAll() {
        BasketItem smartfon = new BasketItem(1000, false);
        assert smartfon.isAgeRestrictedItem() == false;
    }
}
