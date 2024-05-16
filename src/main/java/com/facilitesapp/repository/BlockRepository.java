package com.facilitesapp.repository;

import com.facilitesapp.model.BlockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends JpaRepository<BlockEntity, Integer> {

    BlockEntity findByBlockName(String blockName);

}

