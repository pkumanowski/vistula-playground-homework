package org.vistula.basket;

public class BasketItem {

    private final String asdasd;
    private String product1;
    private String product2;

    public BasketItem(String asdasd){
        this.asdasd = asdasd;
        this.product1 = product1;
        this.product2 = product2;
        this.product2 = this.asdasd;
    }

    private float price;
    boolean ageRestrictedItem;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isAgeRestrictedItem() {
        return ageRestrictedItem;
    }

    public void setAgeRestrictedItem(boolean ageRestrictedItem) {
        this.ageRestrictedItem = ageRestrictedItem;
    }
}
