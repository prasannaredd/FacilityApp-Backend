package com.facilitesapp.service;

import com.facilitesapp.model.CleaningJobEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CleaningJobService {
    Optional<CleaningJobEntity> getCleaningJobByCleanerName(String cleanerName);
    Optional<CleaningJobEntity> getCleaningJobStatusByCleanername(String cleanerName);
}
