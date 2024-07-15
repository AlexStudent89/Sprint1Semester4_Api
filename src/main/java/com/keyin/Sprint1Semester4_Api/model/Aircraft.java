package com.keyin.Sprint1Semester4_Api.model;

import java.util.ArrayList;
import java.util.List;

public class Aircraft {
    private Long id;
    private String type;
    private String airlineName;
    private int numberOfPassengers;

    private List<Airport> listOfAllowedAirports;

    public Aircraft() {}

    public Aircraft(Long id, String type, String airlineName, int numberOfPassengers) {
        this.id = id;
        this.type = type;
        this.airlineName = airlineName;
        this.numberOfPassengers = numberOfPassengers;
        this.listOfAllowedAirports = new ArrayList<>();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getAirlineName() { return airlineName; }
    public void setAirlineName(String airlineName) { this.airlineName = airlineName; }

    public int getNumberOfPassengers() { return numberOfPassengers; }

    public void setNumberOfPassengers(int numberOfPassengers) { this.numberOfPassengers = numberOfPassengers; }

    public List<Airport> getListOfAllowedAirports() {
        return listOfAllowedAirports;
    }

    public void setListOfAllowedAirports(List<Airport> listOfAllowedAirports) {
        this.listOfAllowedAirports = listOfAllowedAirports;
    }
}