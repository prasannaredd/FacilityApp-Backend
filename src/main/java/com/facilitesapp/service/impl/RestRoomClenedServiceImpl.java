package com.facilitesapp.service.impl;

import com.facilitesapp.model.RestRoomsCleanedEntity;

import com.facilitesapp.repository.RestRoomCleanedRepository;

import com.facilitesapp.service.RestRoomClenedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestRoomClenedServiceImpl implements RestRoomClenedService {

    @Autowired
    RestRoomCleanedRepository restRoomClenedRepository;


    @Override
        public List<RestRoomsCleanedEntity> getAllDetailsByRoomId(Integer restRoomId) {
        List<RestRoomsCleanedEntity> restRoomsCleanedEntity = restRoomClenedRepository.findAllByRestRoomsEntity_Id(restRoomId);
        return restRoomsCleanedEntity;
        }



    @Override
    public List<RestRoomsCleanedEntity> getAllCleanedStaffDetails() {
        List<RestRoomsCleanedEntity> restRoomsCleanedEntity = restRoomClenedRepository.findAll();
        return restRoomsCleanedEntity;
    }
    @Override
    public Optional<RestRoomsCleanedEntity> getCleanedStaffDetailsById(Integer staffId) {
        Optional<RestRoomsCleanedEntity> restRoomsClenedEntity = restRoomClenedRepository.findById(staffId);
        return restRoomsClenedEntity;
    }


    }


