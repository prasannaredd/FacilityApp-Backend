package com.facilitesapp.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentLoginRequest {

    private String guestName;

    private String companyName;

    private String purposeOfVisit;

    private String hostName;

    private String hostPhoneNumber;

    private boolean hasVehicle;
}
