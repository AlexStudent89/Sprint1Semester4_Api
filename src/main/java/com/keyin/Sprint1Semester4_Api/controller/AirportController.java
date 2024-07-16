//AirportController
package com.keyin.Sprint1Semester4_Api.controller;

import com.keyin.Sprint1Semester4_Api.model.Airport;
import com.keyin.Sprint1Semester4_Api.model.City;
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


    @GetMapping("/getAllAirports")
    public List<Airport> getAllAirports() {
        return airportService.getAllAirports();
    }

    @PostMapping("/createAirport")
    public void addAirport(@RequestBody Airport airport) {
        airportService.addAirport(airport);
    }

    // To get the Airport by checking the ID
    @GetMapping("/getAirportById/{id}")
    public Airport getAirport(@PathVariable int id) {
        return airportService.getAirport(id);
    }
    // Airport Update
    @PutMapping("/{id}")
    public Airport updateAirport(@PathVariable int id, @RequestBody Airport updatedAirport) {
        return airportService.updateAirport(updatedAirport);
    }
    // To delete an airport
    @DeleteMapping("/{id}")
    public void deleteAirport(@PathVariable int id) {
        airportService.deleteAirport(id);
    }

    @PostMapping("/addCityToAirport/{id}")
    public Airport addCityToAirport(@PathVariable long id, @RequestBody City city){
        Airport airport = airportService.getAirportById(id);
        airport.setCity(city);
        airportService.updateAirport(airport);
        return airport;
    }

}
