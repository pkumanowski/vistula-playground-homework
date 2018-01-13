package org.vistula.basket;

public class PromoteItem extends BasketItem {
    private float discount;

    public PromoteItem(float price, boolean ageRestrictedItem, float discount){
        super(price, ageRestrictedItem);
        this.setPrice(price - ((discount / 50) * price));
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
