package org.vistula.basket;

import org.junit.Test;
import org.vistula.customer.Customer;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


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
    @Test
    public void addItemsPrice(){
        BasketItem bike = new BasketItem(1000, false);
        BasketItem kite = new BasketItem(800, false);
        List<BasketItem> basket = new ArrayList<>();
        Customer Arek = new Customer("Arek","Kowalski", 22, basket);
        basket.add(bike);
        basket.add(kite);
        assertThat(Arek.basketItemsPrice()==1800).isTrue();
    }
    @Test
    public void emptyBasketAgeRestricted(){
        BasketItem beer = new BasketItem(10, true);
        List<BasketItem> basket = new ArrayList<>();
        Customer Marcin = new Customer("Marcin", "Kowalski", 14, basket);
        basket.add(beer);
        assertThat(basket.contains(beer)== false);
    }
    @Test
    public void isItemOnPromotion(){
        BasketItem monitor = new PromoteItem(5000, false, 10);
        List<BasketItem> basket = new ArrayList<>();
        Customer Marcin = new Customer("Marcin", "Kowalski", 28, basket);
        basket.add(monitor);
        assertThat(monitor.getPrice()==4000).isTrue();
    }
    @Test
    public void removingItemsFromBasket(){
        BasketItem beer = new BasketItem(10, true);
        BasketItem kolano = new BasketItem(400, false);
        List<BasketItem> basket = new ArrayList<>();
        Customer Marcin = new Customer("Marcin", "Kowalski", 30, basket);
        basket.add(beer);
        basket.add(kolano);
        Marcin.removeItemsFromBasket(kolano);
        assertThat(basket.contains(beer)).isTrue();
    }
    @Test
    public void addingItemsFromBasket() {
        BasketItem beer = new BasketItem(10, true);
        BasketItem kolano = new BasketItem(400, false);
        List<BasketItem> basket = new ArrayList<>();
        Customer Marcin = new Customer("Marcin", "Kowalski", 30, basket);
        basket.add(beer);
        basket.add(kolano);
        Marcin.addItem(kolano);
        assertThat(basket.contains(kolano)).isTrue();
    }
    @Test
    public void showAllItemsInBasket() {
        BasketItem beer = new BasketItem(10, true);
        BasketItem kolano = new BasketItem(400, false);
        List<BasketItem> basket = new ArrayList<>();
        Customer Marcin = new Customer("Marcin", "Kowalski", 30, basket);
        basket.add(beer);
        basket.add(kolano);
        Marcin.showAllItemsInBasket();
    }
}
