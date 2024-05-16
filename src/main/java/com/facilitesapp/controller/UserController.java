package com.facilitesapp.controller;

import com.facilitesapp.model.*;
import com.facilitesapp.repository.*;
import com.facilitesapp.request.UserLoginRequest;
import com.facilitesapp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private BlockRepository blockRepository;

    @Autowired
    private FloorRepository floorRepository;

    @Autowired
    private FloorService floorService;

    @Autowired
    private RestRoomsService restRoomsService;

    @Autowired
    private RestRoomClenedService restRoomClenedService;

    @Autowired
    private CleaningChecklistService restRoomsClenedEntities;




    @Autowired
    private CleaningJobRepository cleaniangJobRepository;
    @Autowired
    private overViewService overViewService;



    @GetMapping("/getAllBlocks")
    public ResponseEntity<List<BlockEntity>> getAllBlocks() {
        List<BlockEntity> blockEntities = blockRepository.findAll();
        return ResponseEntity.ok(blockEntities);

    }

    @GetMapping("/{blockName}/floors")
    public List<FloorEntity> getFloorsByBlockName(@PathVariable String blockName) {
        return floorService.getFloorsByBlockName(blockName);
    }


    @GetMapping("/getAllRestRooms")
    public List<RestRoomsEntity> getAllRestrooms() {
        return restRoomsService.getAllRestrooms();
    }

    @GetMapping("/by-room/{restroomId}")
    public List<RestRoomsCleanedEntity> getAllDetailsByRoomId(@PathVariable Integer restroomId) {
        List<RestRoomsCleanedEntity> restRoomsClenedEntities = restRoomClenedService.getAllDetailsByRoomId(restroomId);
        return restRoomsClenedEntities;
    }

    @GetMapping("/by-cleaned/{restroomCleanedById}")
    public List<CleaningChecklistEntity> getAllDetailsByCleanedId(@PathVariable Integer restroomCleanedById) {
        List<CleaningChecklistEntity> cleaningChecklistEntities = restRoomsClenedEntities.getCleanedById(restroomCleanedById);
        return cleaningChecklistEntities;
    }




    @GetMapping("/getAllCleanedStaff")
    public List<RestRoomsCleanedEntity> getAllCleanedStaffDetails() {
        List<RestRoomsCleanedEntity> roomsClenedEntities = restRoomClenedService.getAllCleanedStaffDetails();
        return roomsClenedEntities;
    }

    @GetMapping("/getAllOverViewDetails")
    public List<OverViewEntity> getAllOverViewDetails() {
        List<OverViewEntity> overViewEntities = overViewService.getAllOverViewDetails();
        return overViewEntities;
    }

    @GetMapping("/getUserById/{userId}")
    public Optional<UserEntity> getUserById(@PathVariable Integer userId) {
        return userService.findById(userId);
    }

    @GetMapping("/getCleanedStaffId/{staffId}")
    public Optional<RestRoomsCleanedEntity> getCleanedStaffDetailsById(@PathVariable Integer staffId) {
        return restRoomClenedService.getCleanedStaffDetailsById(staffId);
    }
    @PostMapping("/addCleaningJob")
    public ResponseEntity<CleaningJobEntity> addCleaningJob(@RequestBody CleaningJobEntity cleaningJob) {
        CleaningJobEntity savedCleaningJob = cleaniangJobRepository.save(cleaningJob);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCleaningJob);
    }
}
