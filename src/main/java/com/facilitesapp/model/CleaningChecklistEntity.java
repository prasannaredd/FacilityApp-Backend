package com.facilitesapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="cleaning_checklists")
public class CleaningChecklistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "cleaned_by", referencedColumnName = "id")
    private RestRoomsCleanedEntity restRoomsCleanedEntity;
}
