package com.keyin.Sprint1Semester4_Api.controller;

import com. keyin.Sprint1Semester4_Api.model.Passenger;
import com. keyin.Sprint1Semester4_Api.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @PostMapping
    public void addPassenger(@RequestBody Passenger passenger) {
        passengerService.addPassenger(passenger);
    }
}
