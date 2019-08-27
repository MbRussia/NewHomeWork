package com.company.ice_creame_shop;

import com.company.ice_creame_shop.exception.ExceptionTopping;
import com.company.ice_creame_shop.select_type.BoxIceCreameType;
import com.company.ice_creame_shop.select_type.IceCreameType;
import com.company.ice_creame_shop.select_type.ToppingType;

public interface IceCreame {
    void addTopping(ToppingType toppingType) throws ExceptionTopping;
    void addBoxIceCreamType(BoxIceCreameType boxIceCreameType);
    int fullPrice();
    void addIceCreameType(IceCreameType iceCreameType);
    int getTopping();


}
