package com.tonitingaurav.microservice.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tonitingaurav.microservice.db.entity.AssetEntity;

public interface AssetRepository extends JpaRepository<AssetEntity, Integer> {
	List<AssetEntity> findByAssetId(String assetId);
}
