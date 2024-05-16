package com.facilitesapp.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CleaningJobStatusResponse {
    private  String cleanerName;
    private LocalDateTime dateAndTime;
    private  String location;
    private  String status;
    private  String notes;
    public void setLocation(String building, String floor, String area) {
        this.location = building + ", " + floor + ", " + area;
    }

    public void setDateAndTime(LocalDate date, LocalTime time) {
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        this.dateAndTime = dateTime;
    }
}
