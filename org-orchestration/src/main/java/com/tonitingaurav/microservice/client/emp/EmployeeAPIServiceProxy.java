package com.tonitingaurav.microservice.client.emp;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.tonitingaurav.microservice.model.Employees;

//@FeignClient(name = "employee-management", url = "localhost:8080")
//@FeignClient(name = "employee-management") //used in absence of zuul
@FeignClient(name = "zuul-api-gateway")
@RibbonClient(name = "employee-management")
public interface EmployeeAPIServiceProxy {

	// @GetMapping("/employee") //used in absence of zuul
	@GetMapping("/employee-management/employee")
	public Employees getAllEmployees();

}
