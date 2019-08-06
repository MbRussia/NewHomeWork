package com.company.ice_creame_shop;

import com.company.ice_creame_shop.exception.ExceptionTopping;
import com.company.ice_creame_shop.select_type.BoxIceCreameType;
import com.company.ice_creame_shop.select_type.ToppingType;

import java.util.ArrayList;
import java.util.List;

public class IceCreameAbstract implements IceCreame {
    private List<ToppingType> toppings = new ArrayList();
    private ToppingType toppingType;
    private BoxIceCreameType boxIceCreameType;

    @Override
    public void addTopping(ToppingType toppingType) throws ExceptionTopping {
        toppings.add(toppingType);
    }

    @Override
    public void addBoxIceCreamType(BoxIceCreameType boxIceCreameType) {
        this.boxIceCreameType = boxIceCreameType;
    }

    @Override
    public int fullPrice() {
    PriceIceCreame priceIceCreame = new PriceIceCreame();
    priceIceCreame.setAllPrice(boxIceCreameType.getPrice());
        return 0;
    }

    @Override
    public void boxIceCreameType() {

    }
}
