package com.company.ice_creame_shop;

import com.company.ice_creame_shop.exception.ExceptionInput;
import com.company.ice_creame_shop.select_type.ToppingType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ExceptionInput {
        IceCreamShop iceCreamShop = new IceCreamShop();
        iceCreamShop.shopIceCreame();
    }
}
