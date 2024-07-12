package com.keyin.Sprint1Semester4_Api.service;

import com.keyin.Sprint1Semester4_Api.model.Airport;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportService {
    private List<Airport> airportList = new ArrayList<>();

    public List<Airport> getAllAirports() {
        return airportList;
    }

    public void addAirport(Airport airport) {
        airportList.add(airport);
    }
}