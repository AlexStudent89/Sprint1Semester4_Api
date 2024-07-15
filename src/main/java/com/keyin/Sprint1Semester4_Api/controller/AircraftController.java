//AircraftController
package com.keyin.Sprint1Semester4_Api.controller;

import com.keyin.Sprint1Semester4_Api.model.Aircraft;
import com.keyin.Sprint1Semester4_Api.model.Airport;
import com.keyin.Sprint1Semester4_Api.service.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import service.AircraftService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/aircraft")
public class AircraftController {

    @Autowired
    private AircraftService aircraftService;

    @GetMapping("/getAllAircrafts")
    public List<Aircraft> getAllAircraft() {
        return aircraftService.getAllAircraft();
    }

    @PostMapping("/createNewAircraft")
    public void createNewAircraft(@RequestBody Aircraft aircraft) {
        aircraftService.createAircraft(aircraft);
    }


    @PutMapping("/addAllowed/{id}")
    public void addAllowedAirport(@PathVariable long id, @RequestBody Airport airport){
        List<Aircraft> optionalAircraft = aircraftService.searchById(id);
        for(Aircraft aircraft:optionalAircraft){
            if(aircraft.getId().equals(id)){
                aircraft.addAllowedAirport(airport);
            }
        }
    }
    // Edit an aircraft http://localhost:8080/aircraft/{index}
    @PutMapping("/updateAircraft/{id}")
    public Aircraft updateAircraft(@PathVariable long id, @RequestBody Aircraft updatedAircraft) {
        return aircraftService.updateAircraft(id, updatedAircraft);
    }

    //  DELETE an aircraft  http://localhost:8080/aircraft/{index}
    @DeleteMapping("/deleteAircraft/{id}")
    public Aircraft deleteAircraft(@PathVariable long id) {
        aircraftService.deleteAircraft(id);
        System.out.println("Aircraft Gonzo");

        return null;
    }
}
