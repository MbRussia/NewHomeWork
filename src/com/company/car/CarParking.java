package com.company.car;

import java.util.ArrayList;
import java.util.List;

public class CarParking {
    private List<Car> cars = new ArrayList();
    private int p = 1000;
    private  int t = 1500;



    public void addCar(Car car) {
        cars.add(car);

    }


    public List<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CarParking{");
        sb.append("cars=").append(cars);
        sb.append('}');
        return sb.toString();
    }
}
