package com.facilitesapp.service;

import com.facilitesapp.model.FloorEntity;

import java.util.List;

public interface FloorService {
     List<FloorEntity> getFloorsByBlockName(String blockName) ;

}
