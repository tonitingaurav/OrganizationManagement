package com.tonitingaurav.microservice.db.service;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tonitingaurav.microservice.db.entity.AssetEntity;
import com.tonitingaurav.microservice.db.repository.AssetRepository;
import com.tonitingaurav.microservice.exception.AssetAlreadyExistException;
import com.tonitingaurav.microservice.exception.AssetNotFoundException;
import com.tonitingaurav.microservice.model.Asset;

@Service
public class AssetEntityService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private AssetRepository assetRepository;

	public Integer add(Asset asset) {
		String assetId = asset.getAssetId();
		List<AssetEntity> existingAsset = assetRepository.findByAssetId(assetId);

		if (CollectionUtils.isNotEmpty(existingAsset)) {
			throw new AssetAlreadyExistException("Asset with asset ID " + assetId + " already exists");
		}
		AssetEntity assetEntity = modelMapper.map(asset, AssetEntity.class);
		assetEntity = assetRepository.save(assetEntity);
		return assetEntity.getId();
	}

	public Asset get(int id) {
		AssetEntity asset = assetRepository.findById(id).orElseGet(() -> null);
		if (asset == null) {
			throw new AssetNotFoundException("Employee with ID " + id + " not found");
		}
		return modelMapper.map(asset, Asset.class);
	}
}
