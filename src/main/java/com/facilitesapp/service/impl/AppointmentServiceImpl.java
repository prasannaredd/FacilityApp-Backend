package com.facilitesapp.service.impl;

import com.facilitesapp.dto.AppointmentDto;
import com.facilitesapp.mapper.AppointmentMapper;
import com.facilitesapp.model.AppointmentEntity;
import com.facilitesapp.request.AppointmentLoginRequest;
import com.facilitesapp.repository.AppointmentRepository;
import com.facilitesapp.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public AppointmentDto createAppointment(AppointmentDto appointmentDto) {
        appointmentDto.setGuestName(appointmentDto.getGuestName());
        appointmentDto.setCompanyName(appointmentDto.getCompanyName());
        appointmentDto.setPurposeOfVisit(appointmentDto.getPurposeOfVisit());
        appointmentDto.setHostName(appointmentDto.getHostName());
        appointmentDto.setPhoneNumber(appointmentDto.getPhoneNumber());
        appointmentDto.setHostPhoneNumber(appointmentDto.getHostPhoneNumber());
        appointmentDto.setHasVehicle(appointmentDto.getHasVehicle());
        AppointmentEntity appointmentEntity = AppointmentMapper.mapToAppointmentEntity(appointmentDto);
        AppointmentEntity saveAppointmentEntity = appointmentRepository.save(appointmentEntity);
        return AppointmentMapper.mapToAppointmentDto(saveAppointmentEntity);
    }

    @Override
    public List<AppointmentEntity> getAllGuestAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Optional<AppointmentEntity> getGuestAppointmentById(Integer appointmentId) {
        Optional<AppointmentEntity> appointmentEntity = appointmentRepository.findById(appointmentId);
        return appointmentEntity;
    }
}
