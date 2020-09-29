package com.tonitingaurav.microservice.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.tonitingaurav.microservice.db.service.AssetEntityService;
import com.tonitingaurav.microservice.model.Asset;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/asset")
@Api(value = "Asset CURD Operations", tags = { "asset" })
public class AssetController {

	@Autowired
	private AssetEntityService assetEntityService;

	@Value("${spring.jackson.date-format}")
	private String dateFormat;

	@GetMapping
	@RequestMapping("/{id}")
	@ApiOperation(value = "Get Asset Detils")
	public ResponseEntity<Object> get(@PathVariable("id") int id) {
		return ResponseEntity.ok(assetEntityService.get(id));
	}

	@PostMapping
	@ApiOperation(value = "Save a new Asset")
	public ResponseEntity<Object> create(@Valid @RequestBody Asset asset) {
		Integer employeeID = assetEntityService.add(asset);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(employeeID).toUri();
		return ResponseEntity.created(location).build();
	}
}
