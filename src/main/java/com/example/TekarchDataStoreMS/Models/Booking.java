package com.example.TekarchDataStoreMS.Models;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Entity
@Table(name = "Bookings")
@Component
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "flight_id",referencedColumnName = "flight_id")
    private Flight flightId;

    @Column(name="status" , nullable = true)
    private String status; // Status could be "Booked", "Cancelled", etc.

    @Column(name = "created_at",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @UpdateTimestamp
    private LocalDateTime updateAt;

}
