package com.facilitesapp.service;

import com.facilitesapp.model.RoomEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RoomService {

    String AddRoom(String roomName);
    List<RoomEntity> getAllRooms();
}
