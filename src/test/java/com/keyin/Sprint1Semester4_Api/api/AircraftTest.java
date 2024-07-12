package com.keyin.Sprint1Semester4_Api.api;

import com.keyin.Sprint1Semester4_Api.model.Aircraft;
import com.keyin.Sprint1Semester4_Api.service.AircraftService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AircraftTest {

    @Test
    public void testAddAircraft() {
        AircraftService aircraftService = new AircraftService();
        Aircraft aircraft = new Aircraft(1L, "Boeing 747", "Example Airlines", 350);

        aircraftService.addAircraft(aircraft);

        assertEquals(1, aircraftService.getAllAircraft().size());
        assertEquals("Boeing 747", aircraftService.getAllAircraft().get(0).getType());
    }
}