package com.example.FamilyFinance.controller;

import com.example.FamilyFinance.entity.Family;
import com.example.FamilyFinance.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/family")
public class FamilyController {
    @Autowired
    private FamilyService familyService;

    @PostMapping
    public Family createfamily(@RequestBody Family family){
        return familyService.createFamily(family);
    }

    @GetMapping("/{familyId}")
    public Family getFamilyById(@PathVariable Long familyId){
        return familyService.getFamilyById(familyId);
    }

    @GetMapping
    public List<Family> getAllFamilies(){
        return familyService.getAllFamilies();
    }

    @PutMapping("/{familyId}")
    public Family updateFamily(@PathVariable Long familyId,@RequestBody Family family){
        return familyService.updateFamily(familyId,family);
    }

    @DeleteMapping("/{familyId}")
    public void deleteFamily(@PathVariable Long familyId){
        familyService.deleteFamily(familyId);
    }
}
