package com.example.FamilyFinance.repository;

import com.example.FamilyFinance.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

@Repository
public interface AssetRepository extends JpaRepository<Asset,Long> {
}
