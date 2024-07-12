package com.keyin.Sprint1Semester4_Api.api;

import com.keyin.Sprint1Semester4_Api.model.Airport;
import com.keyin.Sprint1Semester4_Api.service.AirportService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirportTest {

    @Test
    public void testDefaultConstructor() {
        Airport airport = new Airport();
        assertEquals(0, airport.getId());
        assertNull(airport.getName());
        assertNull(airport.getCode());
        assertNull(airport.getCity());
    }

    @Test
    public void testParameterizedConstructor() {
        City city = new City(1L, "St.John's", "NL Province", 34100, null, null);

        Airport airport = new Airport(1, "John's International Airport", "YYT", city);

        assertEquals(1, airport.getId());
        assertEquals("John's International Airport", airport.getName());
        assertEquals("YYT", airport.getCode());
        assertEquals(city, airport.getCity());
    }

    @Test
    public void testAddAirport() {
        AirportService airportService = new AirportService();
        Airport airport = new Airport(1L, "JFK International", "JFK", 1L);

        airportService.addAirport(airport);

        assertEquals(1, airportService.getAllAirports().size());
        assertEquals("JFK International", airportService.getAllAirports().get(0).getName());
    }
}
