package com.facilitesapp.repository;

import com.facilitesapp.model.RestRoomsCleanedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RestRoomCleanedRepository extends JpaRepository<RestRoomsCleanedEntity,Integer> {

    List<RestRoomsCleanedEntity> findAllByRestRoomsEntity_Id(Integer restRoomId);
}
