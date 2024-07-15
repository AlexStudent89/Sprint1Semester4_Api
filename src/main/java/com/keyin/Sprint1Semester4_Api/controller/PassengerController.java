package com.keyin.Sprint1Semester4_Api.controller;

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

    @GetMapping
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @PostMapping
    public void createNewPassenger(@RequestBody Passenger passenger) {
        passengerService.addPassenger(passenger);
    }
//    @GetMapping("/{index}")
//    public Passenger getPassenger(@PathVariable Integer index) {
//        return passengerService.getPassenger(index);
//    }

//    @GetMapping("/{index}/aircraft")
//    public List<Aircraft> getAircraftForPassenger(@PathVariable Integer index) {
//        return passengerService.getAircraftForPassenger(index);
//    }

//    @PostMapping
//    public Passenger createPassenger(@RequestBody Passenger newPassenger) {
//        return passengerService.createPassenger(newPassenger);
//    }

//    @PutMapping("/{index}")
//    public Passenger updatePassenger(@PathVariable Integer index, @RequestBody Passenger updatedPassenger) {
//        return passengerService.updatePassenger(index, updatedPassenger);
//    }

//    @DeleteMapping("/{index}")
//    public void deletePassenger(@PathVariable Integer index) {
//        passengerService.deletePassenger(index);
//    }
}
