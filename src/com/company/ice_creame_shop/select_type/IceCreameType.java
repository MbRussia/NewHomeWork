package com.company.ice_creame_shop.select_type;

public enum IceCreameType {
    CHOCOLATE(20), STRAWBERRY(21), BANANA(22), CHERRY(23);
    private int price;

    IceCreameType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
