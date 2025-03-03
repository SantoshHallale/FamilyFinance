package com.example.FamilyFinance.controller;

import com.example.FamilyFinance.entity.Alert;
import com.example.FamilyFinance.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alerts")
public class AlertController {

    @Autowired
    private AlertService alertService;

    @PostMapping
    public Alert createAlert(@RequestBody Alert alert){
        return alertService.createAlert(alert);
    }

    @GetMapping("/{alertId}")
    public Optional<Alert> findById(@PathVariable Long alertId){
        return alertService.findById(alertId);
    }

    @GetMapping
    public List<Alert> getAllAlert(){
        return alertService.getAllAlert();
    }

    @PutMapping("/{alertId}")
    public Alert updateAlert(@PathVariable Long alertId,@RequestBody Alert alert){
        return alertService.updateAlert(alertId,alert);
    }

    @DeleteMapping("/{alterId}")
    void deleteAlert(@PathVariable Long alertId){
        alertService.deleteAlert(alertId);
    }
}
