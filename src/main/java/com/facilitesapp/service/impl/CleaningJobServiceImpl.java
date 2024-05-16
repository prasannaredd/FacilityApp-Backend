package com.facilitesapp.service.impl;

import com.facilitesapp.model.CleaningJobEntity;
import com.facilitesapp.repository.CleaningJobRepository;
import com.facilitesapp.service.CleaningJobService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CleaningJobServiceImpl implements CleaningJobService {

    @Autowired
    private CleaningJobRepository cleaningJobRepository;
    @Override
    public Optional<CleaningJobEntity> getCleaningJobByCleanerName(String cleanerName) {
        Optional<CleaningJobEntity>  cleaner=cleaningJobRepository.findByCleanerName(cleanerName);
        return cleaner;
    }

    @Override
    public Optional<CleaningJobEntity> getCleaningJobStatusByCleanername(String cleanerName) {
        Optional<CleaningJobEntity>  cleaningJobEntity=cleaningJobRepository.findByCleanerName(cleanerName);
        return  cleaningJobEntity;
    }
}
