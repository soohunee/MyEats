package com.myeats.myeats.Model;

import java.net.URL;
import java.util.List;

public class Restaturant {
    private String addressName;
    private String categoryNames;
    private Long id;
    private String phoneNumber;
    private String name;
    private URL url;
    private String roadAddressName;
    private Coordinates coordinates;


    public Restaturant(String addressName, String categoryNames, Long id, String phoneNumber, String name, URL url, String roadAddressName, String x, String y) {
        this.addressName = addressName;
        this.categoryNames = categoryNames;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.url = url;
        this.roadAddressName = roadAddressName;
        this.coordinates = new Coordinates(x, y);
    }
}
