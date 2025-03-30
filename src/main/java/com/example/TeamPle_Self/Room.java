package com.example.TeamPle_Self;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Room {
    @GeneratedValue
    @Id
    private UUID roomId;
    private LocalDateTime createdAt;

    public Room(){
        this.createdAt = LocalDateTime.now();
    }
}
