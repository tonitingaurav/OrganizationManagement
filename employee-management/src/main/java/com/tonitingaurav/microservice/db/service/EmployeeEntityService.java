package com.tonitingaurav.microservice.db.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tonitingaurav.microservice.model.Employee;

@Service
public class EmployeeEntityService {

	@Autowired
	ModelMapper modelMapper;

	public void addEmployee(Employee employee) {

	}
}
