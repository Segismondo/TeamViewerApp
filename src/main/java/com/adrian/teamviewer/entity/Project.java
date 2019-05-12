package com.adrian.teamviewer.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@Entity
@EnableJpaAuditing
public class Project {
	
	@Id
	private Long id;
	private String name;
	private Date startDate;
	private Date endDate;
	
	@ManyToMany//(mappedBy = "project")
	/*@JoinTable(name = "project_like", 
		joinColumns = @JoinColumn(name = "employee_id"), 
		inverseJoinColumns = @JoinColumn(name = "project_id"))
		*/
	
	
	private List<Employee> employees;
	
	public Project() {
		this.id = (long) 999;
		this.name = "";
		//Long startDate = System.currentTimeMillis();
		this.startDate = new Date();
		this.endDate = new Date();
		
	}
	public Project (String name) {
        this.name = name;
	}
        
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Long getId() {
		return id;
	}
	
	
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public String toString() {
		return "Hola";
	}
	
}