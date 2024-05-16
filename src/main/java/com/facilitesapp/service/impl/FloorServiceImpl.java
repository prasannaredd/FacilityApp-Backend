package com.facilitesapp.service.impl;

import com.facilitesapp.model.BlockEntity;
import com.facilitesapp.model.FloorEntity;
import com.facilitesapp.repository.BlockRepository;
import com.facilitesapp.repository.FloorRepository;
import com.facilitesapp.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FloorServiceImpl implements FloorService {

    @Autowired
    BlockRepository blockRepository;

    @Autowired
    FloorRepository floorRepository;
    @Override
    public List<FloorEntity> getFloorsByBlockName(String blockName) {
            BlockEntity block = blockRepository.findByBlockName(blockName);

            Integer blockId = block.getId();
            if (block == null) {
                throw new RuntimeException("Block not found with name: " + blockName);
            }
            List<FloorEntity> floorEntities = floorRepository.findByBlockId(blockId);
            return floorEntities;
        }
    }

