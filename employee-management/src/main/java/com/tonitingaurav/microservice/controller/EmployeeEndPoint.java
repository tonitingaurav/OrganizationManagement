package com.tonitingaurav.microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/employee")
@Api(value = "Employee CURD Operations", tags = { "employee" })
public class EmployeeEndPoint {

}
