package com.facilitesapp.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CleaningJobListRequest {
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.NUMBER)
    private LocalDate date;

    private String blockName;

    private String floorName;
    private String area;

}
