package com.example.TeamPle_Self;

import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private RoomRepository roomRepository;
    public RoomService(RoomRepository roomRepository){
        this.roomRepository =  roomRepository;
    }
    public Room createRoom(){
        Room room = new Room();
        return roomRepository.save(room);
    }
}
