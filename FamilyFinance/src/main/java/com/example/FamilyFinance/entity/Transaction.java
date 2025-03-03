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
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name = "assetId")
    private Asset asset;

    private LocalDate transactionDate;
    private String transactionType;
    private double amount;
    private String category;
    private String description;
}
