package com.example.TekarchDataStoreMS.Repositories;

import com.example.TekarchDataStoreMS.Models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface FlightServiceRepositories extends JpaRepository<Flight,Long> {
    Flight findByflightId( Long flightId);
   // void updateFlight(Flight flight);
    void deleteByflightId( Long flightId);

}
