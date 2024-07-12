package com.keyin.Sprint1Semester4_Api.api;

import com.keyin.Sprint1Semester4_Api.model.Airport;
import com.keyin.Sprint1Semester4_Api.service.AirportService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirportTest {

    @Test
    public void testAddAirport() {
        AirportService airportService = new AirportService();
        Airport airport = new Airport(1L, "JFK International", "JFK", 1L);

        airportService.addAirport(airport);

        assertEquals(1, airportService.getAllAirports().size());
        assertEquals("JFK International", airportService.getAllAirports().get(0).getName());
    }
}