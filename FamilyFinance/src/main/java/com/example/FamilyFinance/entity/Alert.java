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
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long alertId;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    private String alertType;
    private LocalDate alertDate;
    private String message;
}
