package com.cier.pojo;

public class PhoneNumber {
    private String area;
    private String number;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "area='" + area + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
