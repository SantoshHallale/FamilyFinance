package com.example.FamilyFinance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long documentId;
    @ManyToOne
    @JoinColumn(name ="assetId")
    private Asset asset;
    private String documentName;
    private String documentType;
    private String filePath;
    private LocalDate expiryDate;
}
