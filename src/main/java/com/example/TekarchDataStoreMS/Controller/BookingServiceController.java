package com.example.TekarchDataStoreMS.Controller;

import com.example.TekarchDataStoreMS.Models.Booking;
import com.example.TekarchDataStoreMS.Repositories.BookingServiceRepositories;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datastore")
public class BookingServiceController {
    @Autowired
    private BookingServiceRepositories bookingServiceRepositories;

    @PostMapping("/bookings")
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingServiceRepositories.save(booking);
    }

    @GetMapping("/bookings")
    public List<Booking> getBookings() {
        return bookingServiceRepositories.findAll();
    }

    @PutMapping("/bookings/{bookingId}")
    public Booking updateBookingBybookingId(@PathVariable Long bookingId, @RequestBody Booking booking) {
        return bookingServiceRepositories.save(booking);
    }

    @DeleteMapping("/bookings/{bookingId}")
    @Transactional
    public void deleteBookingBybookingId(@PathVariable Long bookingId) {
        bookingServiceRepositories.deleteById(bookingId);
    }

}
