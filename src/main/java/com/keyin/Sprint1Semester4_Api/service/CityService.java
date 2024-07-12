package com.keyin.Sprint1Semester4_Api.service;

import com.keyin.Sprint1Semester4_Api.model.City;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {
    private List<City> cityList = new ArrayList<>();

    public List<City> getAllCities() {
        return cityList;
    }

    public void addCity(City city) {
        cityList.add(city);
    }
}