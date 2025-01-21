package com.example.TekarchDataStoreMS.Models;
import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Entity
@Data
@Component
@Table(name = "flightservice")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id", nullable = true, unique = true)
    private Long flightId;

    @Column(name = "flight_number")
    private String flightNumber;

    @Column(nullable = true)
    private String departure; // City or Airport

    @Column(nullable = true)
    private String arrival; // City or Airport

    @Column(name = "departure_time", nullable = false)
    @CurrentTimestamp
    private LocalDateTime departureTime;

    @Column(name = "arrival_time", nullable = false)
    @CurrentTimestamp
    private LocalDateTime arrivalTime;

    @Column(nullable = true)
    private Double price;

    @Column(name = "available_seats", nullable = true)
    private Integer availableSeats;

    @Column(name = "created_at",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @UpdateTimestamp
    private LocalDateTime updateAt;



}
