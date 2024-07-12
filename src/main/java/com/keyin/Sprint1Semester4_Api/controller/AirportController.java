package com.keyin.Sprint1Semester4_Api.controller;

import com.keyin.Sprint1Semester4_Api.model.Airport;
import com.keyin.Sprint1Semester4_Api.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airport")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping
    public List<Airport> getAllAirports() {
        return airportService.getAllAirports();
    }

    @PostMapping
    public void addAirport(@RequestBody Airport airport) {
        airportService.addAirport(airport);
    }
}