package com.facilitesapp.repository;

import com.facilitesapp.model.SupervisorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupervisorRepository extends JpaRepository<SupervisorEntity ,Integer> {

    SupervisorEntity findByUsername(String username);
}
