package com.facilitesapp.controller;

import com.facilitesapp.model.CleaningJobEntity;
import com.facilitesapp.service.CleaningJobListService;;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/cleaning-job-list")
public class CleaningJobListController {

    private final CleaningJobListService cleaningJobListService;

    public CleaningJobListController(CleaningJobListService cleaningJobListService) {
        this.cleaningJobListService = cleaningJobListService;
    }

    @GetMapping("/getAllCleaningjobs")
    public List<CleaningJobEntity> getAllCleaningJobList(@RequestParam("id") Integer blockId,
                                                         @RequestParam("floorId") Integer floorId,
                                                         @RequestParam("roomId") Integer roomId,
                                                         @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        LocalDate specificDate = LocalDate.of(date.getYear(),date.getMonth(),date.getDayOfMonth());
        return cleaningJobListService.getCleaningJobList(blockId,floorId,roomId,specificDate);
    }
}
