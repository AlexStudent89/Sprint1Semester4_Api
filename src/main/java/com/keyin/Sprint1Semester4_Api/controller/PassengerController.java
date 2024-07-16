package com.keyin.Sprint1Semester4_Api.controller;

import com.keyin.Sprint1Semester4_Api.model.Aircraft;
import com.keyin.Sprint1Semester4_Api.model.Passenger;
import com.keyin.Sprint1Semester4_Api.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;


    @GetMapping("/getAllPassengers")
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @PostMapping("/createNewPassenger")
    public void createNewPassenger(@RequestBody Passenger passenger) {
        passengerService.addPassenger(passenger);
    }
    @GetMapping("/{index}")
    public Passenger getPassenger(@PathVariable Integer index) {
        return passengerService.getPassengerByIndex(index);
    }

    @GetMapping("/{index}/aircraft")
    public List<Aircraft> getAircraftForPassenger(@PathVariable Integer index) {
        return passengerService.getAircraftForPassenger(index);
    }


    @PutMapping("/{index}")
    public Passenger updatePassenger(@PathVariable Integer index, @RequestBody Passenger updatedPassenger) {
        return passengerService.updatePassenger(index, updatedPassenger);
    }

    @DeleteMapping("/{index}")
    public void deletePassenger(@PathVariable Integer index) {
        passengerService.deletePassenger(index);
    }
}
