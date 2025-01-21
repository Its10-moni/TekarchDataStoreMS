package com.example.TekarchDataStoreMS.Models;

import lombok.Data;

@Data
public class BookingDTO {
    private Long bookingId;
    private Long userId;
    private Long flightId;
}

