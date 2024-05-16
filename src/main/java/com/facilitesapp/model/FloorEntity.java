package com.facilitesapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "floors")
public class FloorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "floor_name")
    private String floorName;

    @ManyToOne
    @JoinColumn(name = "block_id", referencedColumnName = "id")
    private BlockEntity block;
}
