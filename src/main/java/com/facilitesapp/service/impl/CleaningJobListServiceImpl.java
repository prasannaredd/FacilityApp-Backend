package com.facilitesapp.service.impl;

import com.facilitesapp.model.CleaningJobEntity;
import com.facilitesapp.repository.CleaningJobRepository;
import com.facilitesapp.service.CleaningJobListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CleaningJobListServiceImpl implements CleaningJobListService {

    @Autowired
    CleaningJobRepository cleaningJobRepository;
    @Override
    public List<CleaningJobEntity> getCleaningJobList(Integer blockId, Integer floorId, Integer roomId, LocalDate date) {
        List<CleaningJobEntity> cleaningJobEntities = cleaningJobRepository.findByBlockIdAndFloorIdAndRoomId(blockId,floorId,roomId,date);

        return cleaningJobEntities;
    }
}