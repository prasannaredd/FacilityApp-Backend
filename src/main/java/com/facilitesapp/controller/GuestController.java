package com.facilitesapp.controller;

import com.facilitesapp.dto.AppointmentDto;
import com.facilitesapp.model.AppointmentEntity;
import com.facilitesapp.repository.GuestLoginRepository;
import com.facilitesapp.request.GuestLoginRequest;
import com.facilitesapp.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/guest")
public class GuestController {

    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private GuestLoginRepository guestLoginRepository;

    @PostMapping("/createGuestAppointment")
    public ResponseEntity<AppointmentDto> createGuestAppointment(@RequestBody AppointmentDto appointmentDto) {
        AppointmentDto addAppointment = appointmentService.createAppointment(appointmentDto);
        return new ResponseEntity<>(addAppointment, HttpStatus.CREATED);
    }

    @GetMapping("/getAllGuestAppointments")
    public List<AppointmentEntity> getAllGuestAppointments() {
        return appointmentService.getAllGuestAppointments();
    }

/*    @GetMapping("/getGuestAppointmentById/{appointmentId}")
    public Optional<AppointmentEntity> getGuestAppointmentById(@PathVariable Integer appointmentId) {
        return appointmentService.getGuestAppointmentById(appointmentId);
    }*/

    @PostMapping("/guestLogin")
    public ResponseEntity<?> guestLogin(@RequestBody GuestLoginRequest loginRequest) {
        AppointmentEntity user = guestLoginRepository.findByGuestName(loginRequest.getGuestName());
        if (user != null && user.getPhoneNumber().equals(loginRequest.getPhoneNumber())) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return ResponseEntity.badRequest().body("Invalid userName or phoneNumber");
        }
    }
}
