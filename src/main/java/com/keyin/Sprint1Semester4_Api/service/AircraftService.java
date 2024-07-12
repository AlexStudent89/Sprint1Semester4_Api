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

    public void addAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }
}