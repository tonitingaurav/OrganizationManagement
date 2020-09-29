package com.tonitingaurav.microservice.client.emp;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.tonitingaurav.microservice.model.Employees;

//@FeignClient(name = "employee-management", url = "localhost:8080")
@FeignClient(name = "employee-management")
@RibbonClient(name = "employee-management")
public interface EmployeeAPIServiceProxy {

	@GetMapping("/employee")
	public Employees getAllEmployees();

}
