package com.example.TeamPle_Self;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TeamPleSelfController {
    //의존성 선언
    private final RoomService roomService;
    //의존성 주입
    TeamPleSelfController(RoomService roomService){
        this.roomService = roomService;
    }

    @PostMapping("/api/rooms")
    Room newRoom(@RequestBody Room newRoom){
       return roomService.createRoom();
    }





}
