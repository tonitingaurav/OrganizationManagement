package com.tonitingaurav.microservice.db.service;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tonitingaurav.microservice.db.entity.EmployeeEntity;
import com.tonitingaurav.microservice.db.repository.EmployeeRepository;
import com.tonitingaurav.microservice.exception.EmployeeAlreadyExistException;
import com.tonitingaurav.microservice.model.Employee;

@Service
public class EmployeeEntityService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private EmployeeRepository employeeRepository;

	public Integer addEmployee(Employee employee) {
		String userName = employee.getUserName();
		List<EmployeeEntity> existingUser = employeeRepository.findByUserName(userName);
		if (CollectionUtils.isNotEmpty(existingUser)) {
			throw new EmployeeAlreadyExistException("Employee with username " + userName + " already exists");
		}
		EmployeeEntity employeeEntity = modelMapper.map(employee, EmployeeEntity.class);
		employeeEntity = employeeRepository.save(employeeEntity);
		return employeeEntity.getId();
	}
}
