package org.vistula.customer;

import org.vistula.basket.BasketItem;

import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private int age;
    private List<BasketItem> basket;


    public Customer(String firstName, String lastName, int age, List<BasketItem> basket) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.basket = basket;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<BasketItem> getBasket() { return basket; }

    public void setBasket(List<BasketItem> basket) { this.basket = basket; }

    public boolean isAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }

    }
    public float basketItemsPrice() {
        float sum;
        sum = 0;
        for (BasketItem item : basket) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void addItem(BasketItem item) {
        if (item.isAgeRestrictedItem()) {
            if (isAdult()) {
                basket.add(item);
            } else {
                return;
            }
        }
        basket.add(item);

    }
    public void showAllItemsInBasket(){
        for (BasketItem item: basket){
            System.out.println(item.toString());
        }
    }
    private void removeItemsFromBasket(BasketItem item){
        if (basket.contains(item)){
            basket.remove(item);
        }
    }
}