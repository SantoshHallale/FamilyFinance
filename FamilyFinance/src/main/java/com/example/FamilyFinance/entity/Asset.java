package com.example.FamilyFinance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long assetId;
    @Column(nullable = false)
    private String assetType;
    @Column(nullable = false)
    private String assetName;
    private double assetValue;

    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family family;

}
