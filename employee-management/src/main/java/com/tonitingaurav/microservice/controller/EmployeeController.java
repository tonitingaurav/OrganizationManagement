package com.tonitingaurav.microservice.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.tonitingaurav.microservice.db.service.EmployeeEntityService;
import com.tonitingaurav.microservice.model.Employee;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/employee")
@Api(value = "Employee CURD Operations", tags = { "employee" })
public class EmployeeController {

	@Autowired
	private EmployeeEntityService employeeEntityService;
	
	@Value("${spring.jackson.date-format}")
	private String dateFormat;
	

	@PostMapping
	public ResponseEntity<Object> create(@Valid @RequestBody Employee employee) {
		Integer employeeID = employeeEntityService.addEmployee(employee);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(employeeID).toUri();
		return ResponseEntity.created(location).build();
	}
}
