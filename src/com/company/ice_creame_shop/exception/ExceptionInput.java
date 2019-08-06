package com.company.ice_creame_shop.exception;

public class ExceptionInput  extends Exception{
    @Override
    public String getMessage() {
        return "Выбран вариант не из списка";
    }
}
