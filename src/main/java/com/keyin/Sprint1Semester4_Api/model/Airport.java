package com.keyin.Sprint1Semester4_Api.model;

import java.util.Objects;

public class Airport {
    private Long id;
    private String name;
    private String code;
    private City city;

    public Airport() {}

    public Airport(Long id, String name, String code, Long cityId) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.city = city;
    }

//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//
//    public String getName() { return name; }
//    public void setName(String name) { this.name = name; }
//
//    public String getCode() { return code; }
//    public void setCode(String code) { this.code = code; }
//
//    public Long getCityId() { return cityId; }
//    public void setCityId(Long cityId) { this.cityId = cityId; }
//
//    public Object getCity() {
//        return null;
//    }
//
//    public void setCity(City city) {
//
//    }

    // The Getters and Setters for the Airport
    public int getId() {
        return Math.toIntExact(id);
    }

    public void setId(int id) {
        this.id = (long) id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return id == airport.id && Objects.equals(name, airport.name) && Objects.equals(code, airport.code) && Objects.equals(city, airport.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code, city);
    }

}