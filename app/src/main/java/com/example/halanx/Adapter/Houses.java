package com.example.halanx.Adapter;

/**
 * Created by acer on 23-Jun-18.
 */

public class Houses {
    private int id;
    private double price;
    private int mbed;
    private String area,street_address,furnish_type, accommodations;

    Houses(int id, double price, int mbed, String street_address, String furnish_type, String accommodations, String area) {
        this.id = id;
        this.area = area;
        this.accommodations = accommodations;
        this.price = price;
        this.mbed = mbed;
        this.street_address = street_address;
        this.furnish_type = furnish_type;
    }

    public int getId() {
        return id;
    }

    double getPrice() {
        return price;
    }

    int getMbed() {
        return mbed;
    }

    String getStreet_address() {
        return street_address;
    }

    String getAccommodations() {
        return accommodations;
    }

    String getArea() {
        return area;
    }

    String getFurnish_type() {
        return furnish_type;
    }

}
