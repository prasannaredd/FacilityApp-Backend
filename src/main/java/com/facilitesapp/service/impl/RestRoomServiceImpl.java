package com.facilitesapp.service.impl;

import com.facilitesapp.model.RestRoomsEntity;
import com.facilitesapp.repository.RestRoomsRepository;
import com.facilitesapp.service.RestRoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestRoomServiceImpl implements RestRoomsService {


        @Autowired
        private RestRoomsRepository restroomRepository;
        @Override
        public List<RestRoomsEntity> getAllRestrooms() {

                List<RestRoomsEntity> restRoomsEntity = restroomRepository.findAll();
            return restroomRepository.findAll();
        }
}
