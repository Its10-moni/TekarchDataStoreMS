package com.example.TekarchDataStoreMS.Controller;

import com.example.TekarchDataStoreMS.Models.Flight;
import com.example.TekarchDataStoreMS.Models.User;
import com.example.TekarchDataStoreMS.Repositories.FlightServiceRepositories;
import com.example.TekarchDataStoreMS.Repositories.UserServiceRepositories;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datastore")
public class FlightServiceController {
    @Autowired
    private FlightServiceRepositories flightServiceRepositories;

    @PostMapping("/flights")
    public Flight createFlight(@RequestBody Flight flight) {
        return flightServiceRepositories.save(flight);
    }

    @GetMapping("/flights")
    public List<Flight> getFlights() {
        return flightServiceRepositories.findAll();
    }
    @GetMapping("/flights/{flightId}")
    public Flight getFlightByflightId(@PathVariable Long flightId) {
        return flightServiceRepositories.findByflightId(flightId);
    }
    @PutMapping("/flights")
    public void updateFlight(@RequestBody Flight flight) {
        flightServiceRepositories.save(flight);
    }
    @PutMapping("/flights/{flightId}")
    public Flight updateFlightByflightId(@PathVariable Long flightId, @RequestBody Flight flight) {
        flight.setFlightId(flightId);
        return flightServiceRepositories.save(flight);
    }

    @DeleteMapping("/flights/{flightId}")
    @Transactional
    public void deleteFlightByflightId(@PathVariable Long flightId) {
        flightServiceRepositories.deleteByflightId(flightId);
    }

}
