package com.facilitesapp.service.impl;

import com.facilitesapp.model.CleaningJobEntity;
import com.facilitesapp.model.SupervisorEntity;
import com.facilitesapp.repository.SupervisorRepository;
import com.facilitesapp.service.SupervisorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupervisorServiceImpl implements SupervisorService {
    @Autowired
    private SupervisorRepository supervisorRepository;
//    @Autowired
//    private CleaningJobStatusRepository cleaningJobStatusRepository;

    @Override
    public Optional<SupervisorEntity> getProfile(Integer id) {
       Optional<SupervisorEntity> supervisor =  supervisorRepository.findById(id);
       return supervisor;
    }

    @Override
    public SupervisorEntity getProfileByUserName(String UserName) {
       SupervisorEntity guests=supervisorRepository.findByUsername(UserName);
        return guests;
    }

//    @Override
//    public List<CleaningJobEntity> getCleaningJobStatusByCleanername(String cleanerName) {
//
//        List<CleaningJobEntity> entity=cleaningJobStatusRepository.findByCleanerName(cleanerName);
//        return   entity;
//    }
}
