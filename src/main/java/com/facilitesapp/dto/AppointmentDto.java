package com.facilitesapp.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value = {"created_date_time"}, allowGetters = true)
public class AppointmentDto {

    private Integer id;
    @JsonProperty("guest_name")
    private String guestName;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("company_name")
    private String companyName;
    @JsonProperty("purpose_of_visit")
    private String purposeOfVisit;
    @JsonProperty("host_name")
    private String hostName;
    @JsonProperty("host_phone_number")
    private String hostPhoneNumber;
    @JsonProperty("created_date_time")
    private LocalDateTime createdDatetime;
    @JsonProperty("has_vehicle")
    private Boolean hasVehicle;
}
