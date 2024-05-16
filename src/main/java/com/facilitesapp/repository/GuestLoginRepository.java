package com.facilitesapp.repository;

import com.facilitesapp.model.AppointmentEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestLoginRepository extends JpaRepository<AppointmentEntity,Integer> {

    AppointmentEntity findByGuestName(String guestName);
}
