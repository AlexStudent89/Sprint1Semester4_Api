package com.keyin.Sprint1Semester4_Api.api;

import com.keyin.Sprint1Semester4_Api.model.City;
import com.keyin.Sprint1Semester4_Api.model.Airport;
import com.keyin.Sprint1Semester4_Api.model.Passenger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

public class CityTest {

    @Test
    public void testDefaultConstructor() {
        City city = new City(1L, "St.John's", "NL Province", 34100, null, null);
        assertNull(city.getId());
        assertNull(city.getName());
        assertNull(city.getProvince());
        assertEquals(0, city.getPopulation());
        assertNull(city.getAirports());
        assertNull(city.getPassengers());
    }

    @Test
    public void testParameterizedConstructor() {
        List<Airport> airports = new ArrayList<>();
        List<Passenger> passengers = new ArrayList<>();

        City city = new City(1L, "St.John's", "NL Province", 34100, airports, passengers);

        assertEquals(1L, city.getId());
        assertEquals("St.John's", city.getName());
        assertEquals("NL Province", city.getProvince());
        assertEquals(34100, city.getPopulation());
        assertEquals(airports, city.getAirports());
        assertEquals(passengers, city.getPassengers());
    }

    @Test
    public void testSettersAndGetters() {
        City city = new City(1L, "St.John's", "NL Province", 34100, null, null);
        city.setId(1L);
        city.setName("Tun");
        city.setProvince("Tunis Province");
        city.setPopulation(680000);

        assertEquals(1L, city.getId());
        assertEquals("Tun", city.getName());
        assertEquals("Tunis Province", city.getProvince());
        assertEquals(680000, city.getPopulation());

        // Test setters and getters for airports
        List<Airport> airports = new ArrayList<>();
        city.setAirports(airports);
        assertEquals(airports, city.getAirports());

        // Test setters and getters for passengers
        List<Passenger> passengers = new ArrayList<>();
        city.setPassengers(passengers);
        assertEquals(passengers, city.getPassengers());
    }

}
