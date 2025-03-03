package com.example.FamilyFinance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long familyId;
    @Column(nullable = false)
    private String familyName;
}
