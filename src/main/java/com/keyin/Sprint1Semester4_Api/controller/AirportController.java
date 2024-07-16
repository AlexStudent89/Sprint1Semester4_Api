//AirportController
package com.keyin.Sprint1Semester4_Api.controller;

import com.keyin.Sprint1Semester4_Api.model.Airport;
import com.keyin.Sprint1Semester4_Api.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
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
    // Using param to get Airport
    @PostMapping("/generate")
    public Airport airport(@RequestParam(value = "id", required = false) int id,
                           @RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "code", required = false) String code,
                           @RequestBody Long city) {
        return airportService.generateAirport(id, name, code, city);
    }
    // To get the Airport by checking the ID
    @GetMapping("/{id}")
    public Airport getAirport(@PathVariable int id) {
        return airportService.getAirport(id);
    }
    // To get all the Airports
    @GetMapping
    public List<Airport> getAllAirports(@RequestParam(value = "city", required = false) String cityName) {
        if (cityName != null) {
            return airportService.getAirportsByCity(cityName);
        } else {
            return airportService.getAllAirports();
        }
    }
    // To create an airport
    @PostMapping
    public Airport createAirport(@RequestBody Airport newAirport) {
        return airportService.createAirport(newAirport);
    }
    // Airport Update
    @PutMapping("/{id}")
    public Airport updateAirport(@PathVariable int id, @RequestBody Airport updatedAirport) {
        return airportService.updateAirport(id, updatedAirport);
    }
    // To delete an airport
    @DeleteMapping("/{id}")
    public void deleteAirport(@PathVariable int id) {
        airportService.deleteAirport(id);
    }

}