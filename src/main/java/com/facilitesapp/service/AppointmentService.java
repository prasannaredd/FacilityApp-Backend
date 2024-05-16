package com.facilitesapp.service;

import com.facilitesapp.dto.AppointmentDto;
import com.facilitesapp.model.AppointmentEntity;
import com.facilitesapp.request.AppointmentLoginRequest;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {

    AppointmentDto createAppointment(AppointmentDto appointmentDto);


    List<AppointmentEntity> getAllGuestAppointments();

    Optional<AppointmentEntity> getGuestAppointmentById(Integer appointmentId);
}
