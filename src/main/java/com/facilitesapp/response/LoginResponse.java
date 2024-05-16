package com.facilitesapp.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private Integer id;
    private String username;
    private String password;
    private  String name;
    private  String email;
    private String  message;
    public LoginResponse(String message) {
        this.message = message;
    }

}
