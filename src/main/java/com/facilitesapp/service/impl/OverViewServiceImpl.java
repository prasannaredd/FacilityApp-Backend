
        package com.facilitesapp.service.impl;
import com.facilitesapp.model.OverViewEntity;
import com.facilitesapp.repository.OverVIewRepository;

import com.facilitesapp.service.overViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class OverViewServiceImpl implements overViewService {
    @Autowired
    OverVIewRepository overviewRepository;

    @Override
    public List<OverViewEntity> getAllOverViewDetails() {
        List<OverViewEntity> overViewEntities = overviewRepository.findAll();
        return overViewEntities;
    }
}