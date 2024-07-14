
package com.keyin.Sprint1Semester4_Api.api;

import com.keyin.Sprint1Semester4_Api.model.Passenger;
import com.keyin.Sprint1Semester4_Api.model.City;
import com.keyin.Sprint1Semester4_Api.model.Aircraft;
//import com.keyin.Sprint1Semester4_Api.service.PassengerService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

public class PassengerTest {

    @Test
    public void testDefaultConstructor() {
        Passenger passenger = new Passenger();
        assertEquals(0L, passenger.getId());
        assertNull(passenger.getFirstName());
        assertNull(passenger.getLastName());
        assertNull(passenger.getPhoneNumber());
        assertNull(passenger.getCity());
        assertNull(passenger.getAircraftList());
    }

    @Test
    public void testParameterizedConstructor() {
        City city = new City(1L, "St.John's", "NL Province", 34100, new ArrayList<>(), new ArrayList<>());
        List<Aircraft> aircraftList = new ArrayList<>();

        Passenger passenger = new Passenger();

        assertEquals(1L, passenger.getId());
        assertEquals("Alex", passenger.getFirstName());
        assertEquals("Ewida", passenger.getLastName());
        assertEquals("7093301698", passenger.getPhoneNumber());
        assertEquals(city, passenger.getCity());
        assertEquals(aircraftList, passenger.getAircraftList());
    }

    @Test
    public void testSettersAndGetters() {
        City city = null;
        List<Aircraft> aircraftList = null;
        Passenger passenger = new Passenger();
        passenger.setId(1L);
        passenger.setFirstName("Mohamed");
        passenger.setLastName("Maghrebi");
        passenger.setPhoneNumber("7093305254");

        city = new City(2L, "Tun", "Tunis Province", 680000, new ArrayList<>(), new ArrayList<>());
        passenger.setCity(city);

        aircraftList = new ArrayList<>();
        passenger.setAircraftList(aircraftList);

        assertEquals(1L, passenger.getId());
        assertEquals("Mohamed", passenger.getFirstName());
        assertEquals("Maghrebi", passenger.getLastName());
        assertEquals("7093305254", passenger.getPhoneNumber());
        assertEquals(city, passenger.getCity());
        assertEquals(aircraftList, passenger.getAircraftList());
    }

}
