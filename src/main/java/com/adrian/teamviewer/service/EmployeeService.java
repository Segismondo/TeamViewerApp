package com.adrian.teamviewer.service;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adrian.teamviewer.entity.Employee;
import com.adrian.teamviewer.repository.EmployeeRepository;
import com.adrian.teamviewer.repository.ProjectRepository;

@Service
public class EmployeeService {
	EmployeeRepository employeeRepository;
	public EmployeeService(EmployeeRepository employeeRepository) {

	    this.employeeRepository = employeeRepository;
}
	
	public Optional<Employee> find(Integer employeeId) {
		return employeeRepository.findById(employeeId);
	}
	public List<Employee> findAll() {
		  
		return employeeRepository.findAll();
	}
	


	

}