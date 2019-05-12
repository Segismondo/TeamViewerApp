package com.adrian.teamviewer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.teamviewer.entity.Employee;
import com.adrian.teamviewer.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	

	
	@GetMapping
	@RequestMapping("/employee/{employeeId}")
	Optional<Employee> getEmployee(@PathVariable("employeeId") Integer employeeId) {
		return employeeService.find(employeeId);
	}

}
