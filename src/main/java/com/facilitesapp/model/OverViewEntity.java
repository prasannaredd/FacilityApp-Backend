package com.facilitesapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "overview")
public class OverViewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "no_of_buildings")
    private Integer noOfBuildings;

    @Column(name = "no_of_staff_memebers")
    private Integer noOfStaffMembers;

    @Column(name = "no_of_floors")
    private Integer noOfFloors;
}
