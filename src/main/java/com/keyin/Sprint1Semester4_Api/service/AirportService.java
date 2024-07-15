//Airport Service
package com.keyin.Sprint1Semester4_Api.service;

import com.keyin.Sprint1Semester4_Api.model.Airport;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportService {
    private List<Airport> airportList = new ArrayList<>();

//    public List<Airport> getAllAirports() {
//        return airportList;
//    }
//
//    public void addAirport(Airport airport) {
//        airportList.add(airport);
//    }

    public Airport generateAirport(int id, String name, String code, Long city) {
        Airport airport = new Airport((long) id, name, code, city);
        airportList.add(airport);
        return airport;
    }

    public Airport getAirport(int id) {
        return airportList.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }

    public List<Airport> getAllAirports() {
        return airportList;
    }

    public Airport createAirport(Airport newAirport) {
        airportList.add(newAirport);
        return newAirport;
    }

    public Airport updateAirport(int id, Airport updatedAirport) {
        for (int i = 0; i < airportList.size(); i++) {
            if (airportList.get(i).getId() == id) {
                airportList.set(i, updatedAirport);
                return updatedAirport;
            }
        }
        return null;
    }

    public void deleteAirport(int id) {
        airportList.removeIf(airport -> airport.getId() == id);
    }

    public List<Airport> getAirportsByCity(String cityName) {
        return null;
    }

    public void addAirport(Airport airport) {
    }
}
