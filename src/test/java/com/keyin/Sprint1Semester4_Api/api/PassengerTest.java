package com.keyin.Sprint1Semester4_Api.api;

import com.keyin.Sprint1Semester4_Api.model.Passenger;
import com.keyin.Sprint1Semester4_Api.service.PassengerService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerTest {

    @Test
    public void testAddPassenger() {
        PassengerService passengerService = new PassengerService();
        Passenger passenger = new Passenger(1L, "Mohamed", "Maghrebi", "1234567890", 1L);

        passengerService.addPassenger(passenger);

        assertEquals(1, passengerService.getAllPassengers().size());
        assertEquals("Mohamed", passengerService.getAllPassengers().get(0).getFirstName());
    }
}

