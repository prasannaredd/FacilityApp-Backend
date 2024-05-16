package com.facilitesapp.mapper;

import com.facilitesapp.dto.AppointmentDto;
import com.facilitesapp.model.AppointmentEntity;

public class AppointmentMapper {
    public static AppointmentDto mapToAppointmentDto(AppointmentEntity appointmentEntity) {
        AppointmentDto appointmentDto = new AppointmentDto();
        appointmentDto.setId(appointmentEntity.getId());
        appointmentDto.setCompanyName(appointmentEntity.getCompanyName());
        appointmentDto.setCreatedDatetime(appointmentEntity.getCreatedDatetime());
        appointmentDto.setGuestName(appointmentEntity.getGuestName());
        appointmentDto.setPhoneNumber(appointmentEntity.getPhoneNumber());
        appointmentDto.setHasVehicle(appointmentEntity.getHasVehicle());
        appointmentDto.setHostName(appointmentEntity.getHostName());
        appointmentDto.setHostPhoneNumber(appointmentEntity.getHostPhoneNumber());
        appointmentDto.setPurposeOfVisit(appointmentEntity.getPurposeOfVisit());
        return appointmentDto;
    }

    public static AppointmentEntity mapToAppointmentEntity(AppointmentDto appointmentDto) {
        AppointmentEntity appointmentEntity = new AppointmentEntity();
        appointmentEntity.setId(appointmentDto.getId());
        appointmentEntity.setCompanyName(appointmentDto.getCompanyName());
        appointmentEntity.setCreatedDatetime(appointmentDto.getCreatedDatetime());
        appointmentEntity.setGuestName(appointmentDto.getGuestName());
        appointmentEntity.setPhoneNumber(appointmentDto.getPhoneNumber());
        appointmentEntity.setHasVehicle(appointmentDto.getHasVehicle());
        appointmentEntity.setHostName(appointmentDto.getHostName());
        appointmentEntity.setHostPhoneNumber(appointmentDto.getHostPhoneNumber());
        appointmentEntity.setPurposeOfVisit(appointmentDto.getPurposeOfVisit());
        return appointmentEntity;
    }
}
