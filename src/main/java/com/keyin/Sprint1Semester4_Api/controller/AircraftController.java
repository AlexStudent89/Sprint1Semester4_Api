//AircraftController
package com.keyin.Sprint1Semester4_Api.controller;

import com.keyin.Sprint1Semester4_Api.model.Aircraft;
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

    @GetMapping
    public List<Aircraft> getAllAircraft() {
        return aircraftService.getAllAircraft();
    }
//    // Get aircraft by index  http://localhost:8080/aircraft/{index}
//    @GetMapping("/{index}")
//    public Aircraft getAircraft(@PathVariable int index) {
//        return aircraftService.getAircraft(index);
//    }
    @PostMapping
    public void addAircraft(@RequestBody Aircraft aircraft) {
        aircraftService.addAircraft(aircraft);
    }
//    // Edit an aircraft http://localhost:8080/aircraft/{index}
//    @PutMapping("/{index}")
//    public Aircraft updateAircraft(@PathVariable int index, @RequestBody Aircraft updatedAircraft) {
//        return aircraftService.updateAircraft(index, updatedAircraft);
//    }
//
//    //  DELETE an aircraft  http://localhost:8080/aircraft/{index}
//    @DeleteMapping("/{index}")
//    public void deleteAircraft(@PathVariable int index) {
//        aircraftService.deleteAircraft(index);
//    }
}
