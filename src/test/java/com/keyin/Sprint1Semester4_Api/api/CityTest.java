package com.keyin.Sprint1Semester4_Api.api;

import com.keyin.Sprint1Semester4_Api.model.City;
import com.keyin.Sprint1Semester4_Api.service.CityService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityTest {

    @Test
    public void testAddCity() {
        CityService cityService = new CityService();
        City city = new City(1L, "New York", "NY", 8000000);

        cityService.addCity(city);

        assertEquals(1, cityService.getAllCities().size());
        assertEquals("New York", cityService.getAllCities().get(0).getName());
    }
}
