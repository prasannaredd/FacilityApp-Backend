package com.facilitesapp.service;

import com.facilitesapp.model.RestRoomsCleanedEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RestRoomClenedService {

    List<RestRoomsCleanedEntity> getAllDetailsByRoomId(Integer roomId);

    Optional<RestRoomsCleanedEntity> getCleanedStaffDetailsById(Integer staffId);

    List<RestRoomsCleanedEntity> getAllCleanedStaffDetails();
}
