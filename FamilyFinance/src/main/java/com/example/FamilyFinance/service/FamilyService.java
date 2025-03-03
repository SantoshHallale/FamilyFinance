package com.example.FamilyFinance.service;

import com.example.FamilyFinance.entity.Family;
import com.example.FamilyFinance.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyService {

    @Autowired
    private FamilyRepository familyRepository;
    public Family createFamily(Family family) {
        return familyRepository.save(family);
    }

    public Family getFamilyById(Long familyId) {
        return familyRepository.findById(familyId).orElse(null);
    }

    public List<Family> getAllFamilies() {
        return familyRepository.findAll();
    }

    public Family updateFamily(Long familyId, Family family) {
        if(familyRepository.existsById(familyId)){
            family.setFamilyId(familyId);
            return familyRepository.save(family);
        }
        return null;
    }

    public void deleteFamily(Long familyId) {
        familyRepository.deleteById(familyId);
    }
}
