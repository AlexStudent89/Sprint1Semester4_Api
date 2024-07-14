
package com.keyin.Sprint1Semester4_Api.api;

import com.keyin.Sprint1Semester4_Api.model.Airport;
import com.keyin.Sprint1Semester4_Api.model.City;
import com.keyin.Sprint1Semester4_Api.service.AirportService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirportTest {

    @Test
    public void testDefaultConstructor() {
        Airport airport = new Airport();
        assertEquals(0L, airport.getId());
        assertNull(airport.getName());
        assertNull(airport.getCode());
        assertNull(airport.getCity());
    }

    @Test
    public void testParameterizedConstructor() {
        City city = new City(1L, "St.John's", "NL Province", 34100, null, null);

        Airport airport = new Airport(1L, "John's International Airport", "YYT", city.getId());

        assertEquals(1L, airport.getId());
        assertEquals("John's International Airport", airport.getName());
        assertEquals("YYT", airport.getCode());
        assertEquals(city, airport.getCity());
    }

    @Test
    public void testSettersAndGetters() {
        Airport airport = new Airport();
        airport.setId(1L);
        airport.setName("Tun");
        airport.setCode("OACI");

        City city = new City(2L, "Tun", "Tunis Province", 680000, null, null);
        airport.setCity(city);

        assertEquals(1L, airport.getId());
        assertEquals("Tun", airport.getName());
        assertEquals("OACI", airport.getCode());
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

    @Test
    public void testEqualsAndHashCode() {
        City city1 = new City(1L, "St.John's", "NL Province", 34100, null, null);
        City city2 = new City(2L, "Tun", "Tunis Province", 680000, null, null);

        Airport airport1 = new Airport(1L, "John's International Airport", "YYT", city1.getId());
        Airport airport2 = new Airport(1L, "John's International Airport", "YYT", city1.getId());
        Airport airport3 = new Airport(2L, "Tun", "OACI", city2.getId());

        assertEquals(airport1, airport2);
        assertNotEquals(airport1, airport3);
        assertEquals(airport1.hashCode(), airport2.hashCode());
        assertNotEquals(airport1.hashCode(), airport3.hashCode());
    }
}
