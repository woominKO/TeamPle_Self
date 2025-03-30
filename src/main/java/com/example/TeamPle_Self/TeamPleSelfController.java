package com.example.TeamPle_Self;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamPleSelfController {
    private final RoomRepository roomRepository;

    TeamPleSelfController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

}
