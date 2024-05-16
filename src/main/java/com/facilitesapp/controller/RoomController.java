package com.facilitesapp.controller;

import com.facilitesapp.model.RoomEntity;
import com.facilitesapp.repository.RoomRepository;
import com.facilitesapp.request.RoomRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    RoomRepository roomRepository;

    @GetMapping
    public List<RoomEntity> getAllRoomsInAFloor() {
        return roomRepository.findAll();
    }

    @PostMapping("/addRooms")
    public String addRoomInAFloor(@RequestBody RoomRequest roomRequest) {
        RoomEntity saveRoom = new RoomEntity();
        saveRoom.setFloorType(roomRequest.getFloorType());

        if (roomRequest.getFloorType() != null) {
            roomRepository.save(saveRoom);
            return "Room Saved Successfully";
        }
        return "Please Enter RoomType";
    }
}
