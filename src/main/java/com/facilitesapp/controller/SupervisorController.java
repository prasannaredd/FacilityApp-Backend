package com.facilitesapp.controller;

import com.facilitesapp.model.CleaningJobEntity;
import com.facilitesapp.model.SupervisorEntity;
import com.facilitesapp.repository.CleaningJobRepository;
import com.facilitesapp.repository.SupervisorRepository;
import com.facilitesapp.request.SupervisorLoginRequest;
import com.facilitesapp.response.CleaningJobStatusResponse;
import com.facilitesapp.response.LoginResponse;
import com.facilitesapp.response.ProfileResponse;
import com.facilitesapp.service.CleaningJobService;
import com.facilitesapp.service.SupervisorService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/api/supervisor")
public class SupervisorController {

    @Autowired
    private SupervisorRepository supervisorRepository;
    @Autowired
    private SupervisorService supervisorService;
    @Autowired
    private CleaningJobRepository cleaningJobRepository;
    @Autowired
    private CleaningJobService cleaningJobService;


    @PostMapping("/supervisorLogin")
    public ResponseEntity<LoginResponse> login(@RequestBody SupervisorLoginRequest loginRequest) {
        String secretKey = generateSecretKey();
        SupervisorEntity user = supervisorRepository.findByUsername(loginRequest.getUsername());
        if (user != null && user.getPassword().equals(loginRequest.getPassword()))
        {

            String token = Jwts.builder()
                    .setSubject(user.getUsername())
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + 86400000))
                    .signWith(SignatureAlgorithm.HS256, secretKey)
                    .compact();
          //  return ResponseEntity.ok().body(user);
            LoginResponse loginResponse=new LoginResponse();
            loginResponse.setId(user.getId());
            loginResponse.setUsername(user.getUsername());
            loginResponse.setPassword(user.getPassword());
            loginResponse.setName(user.getName());
            loginResponse.setEmail(user.getEmail());
            loginResponse.setMessage("Successfully logged in");
            return ResponseEntity.ok()
                    .header(HttpHeaders.AUTHORIZATION, token)
                    .body(loginResponse);
        } else {


            return ResponseEntity.badRequest().body(new LoginResponse("Invalid Credentials"));
        }

    }

    private String generateSecretKey() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] secretKeyBytes = new byte[32]; // 256 bits
        secureRandom.nextBytes(secretKeyBytes);
        return Base64.getEncoder().encodeToString(secretKeyBytes);
    }

    @GetMapping("/getProfile/{id}")
    public ProfileResponse getProfile(@PathVariable Integer id) {
        Optional<SupervisorEntity> supervisor = supervisorService.getProfile(id);
        ProfileResponse response = new ProfileResponse();
        response.setName(supervisor.get().getName());
        response.setEmail(supervisor.get().getEmail());
        return response;
    }

    @GetMapping("/getProfileByUserName/{UserName}")
    public ProfileResponse getProfileByGuestName(@PathVariable String  UserName ) {
        SupervisorEntity supervisor = supervisorService.getProfileByUserName(UserName);
        ProfileResponse response = new ProfileResponse();
        response.setName(supervisor.getName());
        response.setEmail(supervisor.getEmail());
        return response;
    }

    @GetMapping("/getCleaningJobDetailsStatusByCleanerName/{CleanerName}")
    public ResponseEntity<CleaningJobStatusResponse> getCleaningJobStatusByCleanername(@NonNull @PathVariable String CleanerName) {
        Optional<CleaningJobEntity> response = cleaningJobService.getCleaningJobStatusByCleanername(CleanerName);
        CleaningJobStatusResponse cleaningJobStatusResponse = new CleaningJobStatusResponse();
        cleaningJobStatusResponse.setStatus("");
        cleaningJobStatusResponse.setNotes(response.get().getNotes());
        cleaningJobStatusResponse.setLocation(response.get().getBlockEntity().getBlockName(), response.get().getFloorEntity().getFloorName(), response.get().getArea());
        cleaningJobStatusResponse.setCleanerName(response.get().getCleanerName());
        cleaningJobStatusResponse.setDateAndTime(response.get().getDate(), response.get().getTime());

        return ResponseEntity.ok(cleaningJobStatusResponse);
    }


    @GetMapping("/getCleaningJobByCleanerName/{CleanerName}")
    public ResponseEntity<Optional<CleaningJobEntity>> getCleaningJobByCleanerName(@PathVariable String CleanerName)
    {
        Optional<CleaningJobEntity>entity=  cleaningJobService.getCleaningJobByCleanerName(CleanerName);


        return  ResponseEntity.ok(entity);
    }



}
