package com.example.FamilyFinance.controller;

import com.example.FamilyFinance.entity.Asset;
import com.example.FamilyFinance.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/assets")
public class AssetController {
    @Autowired
    private AssetService assetService;

    @PostMapping
    public Asset createAsset(@RequestBody Asset asset){
        return assetService.createAsset(asset);
    }

    @GetMapping("/{assetId}")
    public Optional<Asset> getAssetById(@PathVariable Long assetId){
        return assetService.getAssetById(assetId);
    }
    @GetMapping
    public List<Asset> getAllAsset(){
        return assetService.getAllAsset();
    }
    @PutMapping("/{assetId}")
    public Asset updateAsset(@PathVariable Long assetId,@RequestBody Asset asset){
        return assetService.updateAsset(assetId,asset);
    }
    @DeleteMapping("/{assetId}")
    public void deleteAssetId(@PathVariable Long assetId){
        assetService.deleteAsset(assetId);
    }
}
