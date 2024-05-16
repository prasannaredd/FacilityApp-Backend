package com.facilitesapp.service.impl;

import com.facilitesapp.model.FloorEntity;
import com.facilitesapp.model.RoomEntity;
import com.facilitesapp.repository.FloorRepository;
import com.facilitesapp.repository.RoomRepository;
import com.facilitesapp.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepository  roomRepository;

    @Autowired
    FloorRepository floorRepository;

    @Override
    public String AddRoom(String roomName) {

        return null;
    }

    @Override
    public List<RoomEntity> getAllRooms() {
        return null;
    }

}
