package com.facilitesapp.model;

import com.facilitesapp.mapper.BooleanToStringConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "appointment")
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="guest_name")
    private String guestName;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name="company_name")
    private String companyName;
    @Column(name="purpose_of_visit")
    private String purposeOfVisit;
    @Column(name="host_name")
    private String  hostName;
    @Column(name="host_phone_number")
    private String hostPhoneNumber;
    @CreatedDate
    @Column(name = "created_datetime", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdDatetime;
    @PrePersist
    public void prePersist() {
        this.createdDatetime = LocalDateTime.now();
    }
    @Column(name="has_vehicle")
    @Convert(converter = BooleanToStringConverter.class)
    private Boolean hasVehicle;

}
