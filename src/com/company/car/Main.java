package com.company.car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int  allprice = 0;
        CarParking carParking = new CarParking();
        carParking.addCar(new PassengerCar("1","1"));
        carParking.addCar(new PassengerCar("2","2"));
        carParking.addCar(new TruckCar("3", "3"));
        carParking.addCar(new TruckCar("4","4"));

        System.out.println(carParking.toString());

    }
}
