package com.example.FamilyFinance.service;

import com.example.FamilyFinance.entity.Alert;
import com.example.FamilyFinance.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlertService {
    @Autowired
    private AlertRepository alertRepository;

    public Alert createAlert(Alert alert) {
        return alertRepository.save(alert);
    }

    public Optional<Alert> findById(Long alertId) {
        return alertRepository.findById(alertId);
    }

    public List<Alert> getAllAlert() {
        return alertRepository.findAll();
    }

    public Alert updateAlert(Long alertId, Alert alert) {
        if(alertRepository.existsById(alertId)){
            alert.setAlertId(alertId);
            return alertRepository.save(alert);
        }
        return null;
    }

    public void deleteAlert(Long alertId) {
        alertRepository.deleteById(alertId);
    }
}
