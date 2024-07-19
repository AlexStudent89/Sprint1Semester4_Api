package com.keyin.Sprint1Semester4_Api.service;

import com.keyin.Sprint1Semester4_Api.model.Airport;
import com.keyin.Sprint1Semester4_Api.model.City;
import com.keyin.Sprint1Semester4_Api.model.Passenger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {
    private List<City> cityList = new ArrayList<>();

    public List<City> getAllCities() {
        return cityList;
    }

    public City addCity(City city) {
        cityList.add(city);
        return city;
    }

    public City generateCity(Long id, String name, String province, int population) {
        return null;
    }

    public City getCity(Integer index) {
        return null;
    }

    public City createCity(City newCity) {
        return newCity;
    }

    public City updateCity(Integer index, City updatedCity) {
        return updatedCity;
    }

    public void deleteCity(Integer index) {
    }

    public List<Airport> getAirportsInCity(Integer index) {
        return List.of();
    }

    public List<Passenger> getPassengersInCity(Integer index) {
        return List.of();
    }


}