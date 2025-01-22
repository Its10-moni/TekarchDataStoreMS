package com.example.TekarchDataStoreMS.Controller;

import com.example.TekarchDataStoreMS.Models.*;
import com.example.TekarchDataStoreMS.Repositories.BookingServiceRepositories;
import com.example.TekarchDataStoreMS.Repositories.FlightServiceRepositories;
import com.example.TekarchDataStoreMS.Repositories.UserServiceRepositories;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datastore")
public class BookingServiceController {

    @Autowired
    private BookingServiceRepositories bookingServiceRepositories;
    @Autowired
    private FlightServiceRepositories flightServiceRepositories;
    @Autowired
    private UserServiceRepositories userServiceRepositories;

    @PostMapping("/bookings")
    public Booking createBooking(@RequestBody BookingDTO bookingRequest) {
        User user = userServiceRepositories.findByuserId(bookingRequest.getUserId());
        Flight flight = flightServiceRepositories.findByflightId(bookingRequest.getFlightId());
        Booking booking = new Booking();
        booking.setUser(user);
        booking.setFlight(flight);
        booking.setStatus(Status.valueOf("BOOKED"));
       return bookingServiceRepositories.save(booking);
    }

    @GetMapping("/bookings")
    public List<Booking> getBookings() {
        return bookingServiceRepositories.findAll();
    }
    @GetMapping("/bookings/{bookingId}")
    public Booking getBookingsBybookingId(@PathVariable Long bookingId) {
        return bookingServiceRepositories.findBybookingId(bookingId);
    }
    @PutMapping("/bookings")
    public Booking updateBooking(@RequestBody Booking booking) {
        return bookingServiceRepositories.save(booking);
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
