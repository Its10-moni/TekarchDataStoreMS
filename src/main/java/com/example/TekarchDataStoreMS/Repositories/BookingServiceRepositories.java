package com.example.TekarchDataStoreMS.Repositories;

import com.example.TekarchDataStoreMS.Models.Booking;
import com.example.TekarchDataStoreMS.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface BookingServiceRepositories extends JpaRepository<Booking,Long> {
    Booking findBybookingId(Long bookingId);
}
