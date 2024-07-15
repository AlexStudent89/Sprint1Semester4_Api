package com.keyin.Sprint1Semester4_Api.service;

import com.keyin.Sprint1Semester4_Api.model.Aircraft;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AircraftService {
    private List<Aircraft> aircraftList = new ArrayList<>();

    public List<Aircraft> getAllAircraft() {
        return aircraftList;
    }

    public Aircraft createAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
        return aircraft;
    }

    public List<Aircraft> searchById(long id) {
        List<Aircraft> searchResults = new ArrayList<>();

        for(Aircraft aircraft: aircraftList){
            if(aircraft.getId().equals(id)){
                searchResults.add(aircraft);
            }
        }
        return searchResults;
    }

    public Aircraft updateAircraft(long index, Aircraft updatedAircraft) {
        
        Aircraft aircraft = searchByIdSingle(index);

        aircraftList.remove(aircraft);

        aircraftList.add(updatedAircraft);

        return updatedAircraft;
    }

    private Aircraft searchByIdSingle(long index) {
        for(Aircraft aircraft: aircraftList){
            if(aircraft.getId().equals(index)){
                return aircraft;
            }
        }
        return null;
    }

    public void deleteAircraft(long index){
        aircraftList.removeIf(aircraft1 -> aircraft1.getId().equals(index));

    }


    // Need to have full CRUD for each entity.

}