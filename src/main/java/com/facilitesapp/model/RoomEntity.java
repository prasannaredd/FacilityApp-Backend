package com.facilitesapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rooms")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String floorType;
//    @ManyToOne
//    @JoinColumn(name = "floor_id", referencedColumnName = "id")
//    private FloorEntity floorEntity;

}