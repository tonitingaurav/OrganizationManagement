package com.tonitingaurav.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tonitingaurav.microservice.client.emp.EmployeeAPIServiceProxy;
import com.tonitingaurav.microservice.model.Employees;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeAPIServiceProxy employeeAPIServiceProxy;
	
	public Employees getAllEmployees() {
		return employeeAPIServiceProxy.getAllEmployees();
	}
}
