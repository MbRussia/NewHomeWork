package com.company.ice_creame_shop.select_type;

public enum ToppingType {
    NUT(10), CHOKOLATE(20), FRUIT(30), SYRUP(40);
    private int price;

   ToppingType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
