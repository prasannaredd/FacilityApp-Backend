package com.facilitesapp.service.impl;

import com.facilitesapp.model.CleaningChecklistEntity;
import com.facilitesapp.repository.CleaningChecklistRepository;
import com.facilitesapp.service.CleaningChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CleaningChecklistServiceImpl implements CleaningChecklistService {

    @Autowired
    CleaningChecklistRepository cleaningChecklistRepository;
    @Override
    public List<CleaningChecklistEntity> getCleanedById(Integer id) {
        return cleaningChecklistRepository.findByRestRoomsCleanedEntity_Id(id) ;
    }
}
