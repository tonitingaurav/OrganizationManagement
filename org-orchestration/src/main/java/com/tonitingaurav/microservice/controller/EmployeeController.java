package com.tonitingaurav.microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/")
@Api(value = "Employee Application Manager", tags = { "employee" })
public class EmployeeController {

}
