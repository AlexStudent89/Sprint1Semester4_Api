package com.keyin.Sprint1Semester4_Api.controller;

import com.keyin.Sprint1Semester4_Api.model.City;
import com.keyin.Sprint1Semester4_Api.service.CityService;
import com.keyin.Sprint1Semester4_Api.model.Passenger;
import com.keyin.Sprint1Semester4_Api.model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;


//    @PostMapping
//    public void addCity(@RequestBody City city) {
//        cityService.addCity(city);
//    }

    // Get City by param


    @GetMapping("/city/{index}")
    public City getCity(@PathVariable Integer index) {
        return cityService.getCity(index);
    }

    @GetMapping("/cities")
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @PostMapping("/city")
    public City createCity(@RequestBody City newCity) {
        return cityService.addCity(newCity);
    }

    @PutMapping("/city/{index}")
    public City updateCity(@PathVariable Integer index, @RequestBody City updatedCity) {
        return cityService.updateCity(index, updatedCity);
    }

    @DeleteMapping("/city/{index}")
    public void deleteCity(@PathVariable Integer index) {
        cityService.deleteCity(index);
    }

    @GetMapping("/city/{index}/airports")
    public List<Airport> getAirportsInCity(@PathVariable Integer index) {
        return cityService.getAirportsInCity(index);
    }

    @GetMapping("/city/{index}/passengers")
    public List<Passenger> getPassengersInCity(@PathVariable Integer index) {
        return cityService.getPassengersInCity(index);
    }
}
