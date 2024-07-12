package com.keyin.Sprint1Semester4_Api.service;

import com.keyin.Sprint1Semester4_Api.model.Passenger;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {
    private List<Passenger> passengerList = new ArrayList<>();

    public List<Passenger> getAllPassengers() {
        return passengerList;
    }

    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
    }
}
