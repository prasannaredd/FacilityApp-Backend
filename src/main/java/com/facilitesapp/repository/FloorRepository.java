package com.facilitesapp.repository;

import com.facilitesapp.model.FloorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FloorRepository extends JpaRepository<FloorEntity,Integer> {

    List<FloorEntity> findByBlockId(Integer blockId);


};