package com.facilitesapp.service;

import com.facilitesapp.model.CleaningJobEntity;

import java.time.LocalDate;
import java.util.List;

public interface CleaningJobListService {
    public List<CleaningJobEntity> getCleaningJobList(Integer blockId, Integer floorId, Integer roomId, LocalDate date);
}