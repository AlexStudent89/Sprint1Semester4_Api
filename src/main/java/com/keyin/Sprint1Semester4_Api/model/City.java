package com.keyin.Sprint1Semester4_Api.model;

import java.util.List;

public class City {
    private Long id;
    private String name;
    private String state;
    private int population;

    public City(long l, String s, String nlProvince, int i, Object o, Object object) {}

    public City(Long id, String name, String state, int population) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.population = population;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public int getPopulation() { return population; }
    public void setPopulation(int population) { this.population = population; }

    public Object getProvince() {
        return null;
    }

    public Object getAirports() {
        return null;
    }

    public Object getPassengers() {
        return null;
    }

    public void setProvince(String tunisProvince) {
    }

    public void setAirports(List<Airport> airports) {
    }

    public void setPassengers(List<Passenger> passengers) {
    }
}