package com.example.TekarchDataStoreMS.Models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Entity
@Data
@Table(name = "userservice")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = true, unique = true)
    private Long userId;
    @Column(name = "user_name", nullable = true, unique = true)
    private String username;
    @Column(name = "email", nullable = true, length = 20)
    private String email;
    @Column(name = "phone", nullable =true,length = 20)
    private String phone;
    @Column(name = "created_at",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(name = "updated_at",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @UpdateTimestamp
    private LocalDateTime updateAt;
    public User() {
        // Default constructor
    }

  /*  @JsonCreator
    public User(@JsonProperty("userId") Long userId) {
        this.userId = userId;
    }


   /* @JsonCreator
    public static User createUser(@JsonProperty("userId") Long userId) {
        return new User(userId);
    }*/


}



