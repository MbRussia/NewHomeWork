package com.company.ice_creame_shop.exception;

public class ExceptionTopping extends Exception {
    @Override
    public String getMessage() {
        return "Вы не можете выбрать больше четырех топпингов";
    }
}
