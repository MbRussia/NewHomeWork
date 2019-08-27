package com.company.ice_creame_shop.select_type;

public enum BoxIceCreameType {
    CUP(10), HORN(10);
    private int price;

    BoxIceCreameType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
