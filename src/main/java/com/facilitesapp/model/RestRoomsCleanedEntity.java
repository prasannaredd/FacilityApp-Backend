package com.facilitesapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rest_rooms_cleaned")
public class RestRoomsCleanedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "cleaned_by")
    private  String cleanedBy;
    @Column(name = "cleaned_at")
    private LocalDateTime cleanedAt;

    @ManyToOne
    @JoinColumn(name = "rest_room_id", referencedColumnName = "id")
    private RestRoomsEntity restRoomsEntity;

}
