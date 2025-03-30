package com.example.TeamPle_Self;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

interface RoomRepository extends JpaRepository<Room, UUID>{

}
