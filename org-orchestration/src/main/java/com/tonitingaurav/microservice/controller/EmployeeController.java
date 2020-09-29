package com.tonitingaurav.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tonitingaurav.microservice.EmployeeService;
import com.tonitingaurav.microservice.model.Employees;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/employee")
@Api(value = "Employee Application Manager", tags = { "employee" })
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping
	@ApiOperation(value = "Get All Employees Detils")
	public Employees getEmployees() {
		return employeeService.getAllEmployees();
	}
}
