package com.company.ice_creame_shop;

import com.company.ice_creame_shop.select_type.BoxIceCreameType;
import com.company.ice_creame_shop.select_type.IceCreameType;
import com.company.ice_creame_shop.select_type.ToppingType;

import java.util.ArrayList;
import java.util.List;

public class IceCreameAbstract implements IceCreame {
    private List<ToppingType> toppings = new ArrayList();
    private PriceIceCreame priceIceCreame = new PriceIceCreame();
    private BoxIceCreameType boxIceCreameType;
    private IceCreameType iceCreameType;

    public String getBoxIceCreameType() {
        if (boxIceCreameType != null) {
            return boxIceCreameType.name();
        }
        return null;
    }
    public String getIceCreameType() {
        if (iceCreameType != null) {
            return iceCreameType.name();
        }
        return null;
    }

    @Override
    public void addTopping(ToppingType toppingType) {
        toppings.add(toppingType);
    }

    @Override
    public void addBoxIceCreamType(BoxIceCreameType boxIceCreameType) {
        this.boxIceCreameType = boxIceCreameType;
    }

    @Override
    public int fullPrice() {
        priceIceCreame.setAllPrice(boxIceCreameType.getPrice());
        priceIceCreame.setAllPrice(iceCreameType.getPrice());
        if (!toppings.isEmpty()) {
            for (ToppingType topping : toppings) {
                priceIceCreame.setAllPrice(topping.getPrice());
            }
        }
        return priceIceCreame.getAllPrice();
    }

    @Override
    public void addIceCreameType(IceCreameType iceCreameType) {
    this.iceCreameType = iceCreameType;
    }



    @Override
    public int getTopping() {
        return toppings.size();
    }


    @Override
    public String toString() {
        return "Топпинг" + toppings;
    }
}
