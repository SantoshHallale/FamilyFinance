package com.example.FamilyFinance.service;

import com.example.FamilyFinance.entity.Asset;
import com.example.FamilyFinance.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssetService {

    @Autowired
    private AssetRepository assetRepository;
    public Asset createAsset(Asset asset) {
        return assetRepository.save(asset);
    }

    public Optional<Asset> getAssetById(Long assetId) {
        return assetRepository.findById(assetId);
    }

    public List<Asset> getAllAsset() {
        return assetRepository.findAll();
    }

    public Asset updateAsset(Long assetId, Asset asset) {
        if(assetRepository.existsById(assetId)){
            asset.setAssetId(assetId);
            return assetRepository.save(asset);
        }
        return null;
    }

    public void deleteAsset(Long assetId) {
        assetRepository.deleteById(assetId);
    }
}
