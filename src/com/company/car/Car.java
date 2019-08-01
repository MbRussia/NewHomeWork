package com.company.car;

public abstract class Car {
    private String mark;
    private String number;

    public Car(String mark, String number) {
        this.mark = mark;
        this.number = number;
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("mark='").append(mark).append('\'');
        sb.append(", number='").append(number).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
