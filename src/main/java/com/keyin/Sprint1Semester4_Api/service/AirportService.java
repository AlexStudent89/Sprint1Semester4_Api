//AirportService
package com.keyin.Sprint1Semester4_Api.service;

import com.keyin.Sprint1Semester4_Api.model.Airport;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class AirportService {
    private List<Airport> airportList = new ArrayList<>();

   public List<Airport> getAllAirports() {
       return airportList;
    }

   public void addAirport(Airport airport) {
       airportList.add(airport);
    }

    public Airport getAirport(int id) {
        return airportList.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }

    public Airport createAirport(Airport newAirport) {
        airportList.add(newAirport);
        return newAirport;
    }

    public Airport updateAirport(Airport updatedAirport) {
        for (int i = 0; i < airportList.size(); i++) {
            if (Objects.equals(airportList.get(i).getId(), updatedAirport.getId())) {
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


    public Airport getAirportById(long id) {
       Airport airport= new Airport();
       for (Airport airport2 :airportList){
           if(airport2.getId().equals(id)){
               airport.setId(airport2.getId());
               airport.setName(airport2.getName());
               airport.setCode(airport2.getCode());
               airport.setCity(null);

           }

       }
        return  airport;
    }

}
