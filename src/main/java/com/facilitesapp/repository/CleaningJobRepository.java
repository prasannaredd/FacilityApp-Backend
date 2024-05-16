package com.facilitesapp.repository;

import com.facilitesapp.model.CleaningJobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface CleaningJobRepository extends JpaRepository<CleaningJobEntity,Integer> {
    @Query(value = "SELECT * FROM `test-facilites`.`cleaning_job` WHERE cleaner_name = ?1", nativeQuery = true)
    Optional<CleaningJobEntity> findByCleanerName(String CleanerName);
    @Query(value = "SELECT * FROM `test-facilites`.`cleaning_job` WHERE block_entity_id = :blockId and floor_entity_id=:floorId and room_entity_id=:roomId and DATE(date) =:date ", nativeQuery = true)
    List<CleaningJobEntity> findByBlockIdAndFloorIdAndRoomId(Integer blockId, Integer floorId, Integer roomId, LocalDate date);
}