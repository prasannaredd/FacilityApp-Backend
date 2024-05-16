package com.facilitesapp.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuestLoginRequest {
    private String guestName;
    private String phoneNumber;
}
