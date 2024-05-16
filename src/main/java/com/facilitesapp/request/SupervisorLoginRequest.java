package com.facilitesapp.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupervisorLoginRequest {

    private String username;
    private String password;
}
