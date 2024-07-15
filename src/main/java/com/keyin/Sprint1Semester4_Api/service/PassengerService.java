package com.keyin.Sprint1Semester4_Api.service;

import com.keyin.Sprint1Semester4_Api.model.Passenger;
import com.keyin.Sprint1Semester4_Api.model.Aircraft;
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
      //To retrieve a passenger by index
//    public Passenger getPassengerByIndex(int index) {
//        if (index >= 0 && index < passengers.size()) {
//            return passengers.get(index);
//        }
//        return null;
//    }

    // To create a new passenger
//    public Passenger createPassenger(Passenger newPassenger) {
//        passengers.add(newPassenger);
//        return newPassenger;
//    }

    // To Update a passenger
//    public Passenger updatePassenger(int index, Passenger updatedPassenger) {
//        if (index >= 0 && index < passengers.size()) {
//            passengers.set(index, updatedPassenger);
//            return updatedPassenger;
//        }
//        return null;
//    }

    // To get a plane for a passenger
//    public List<Aircraft> getAircraftForPassenger(int index) {
//        if (index >= 0 && index < passengers.size()) {
//            return passengers.get(index).getAircraftList();
//        }
//        throw new RuntimeException("Passenger not found with index: " + index);
//    }

    // To remove a passenger
//    public void deletePassenger(int index) {
//        if (index >= 0 && index < passengers.size()) {
//            passengers.remove(index);
//        }
//    }


}
