package com.example.TekarchDataStoreMS.Repositories;

import com.example.TekarchDataStoreMS.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingServiceRepositories extends JpaRepository<Booking,Long> {
}
