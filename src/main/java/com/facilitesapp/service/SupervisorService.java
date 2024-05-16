package com.facilitesapp.service;

import com.facilitesapp.model.CleaningJobEntity;
import com.facilitesapp.model.SupervisorEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SupervisorService {
    Optional<SupervisorEntity> getProfile(Integer id);
    SupervisorEntity getProfileByUserName(String UserName);
    //List<CleaningJobEntity> getCleaningJobStatusByCleanername(String cleanerName);
}
