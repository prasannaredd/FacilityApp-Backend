package com.facilitesapp.repository;

import com.facilitesapp.model.CleaningChecklistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CleaningChecklistRepository extends JpaRepository<CleaningChecklistEntity,Integer> {

    List<CleaningChecklistEntity> findByRestRoomsCleanedEntity_Id(Integer id);
}
