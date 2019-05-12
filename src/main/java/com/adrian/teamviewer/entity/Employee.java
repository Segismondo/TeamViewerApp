package com.adrian.teamviewer.entity;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@Entity
@EnableJpaAuditing
public class Employee{

	@Id
	private Integer id;
	private String name;
	
	@ManyToMany
	private List<Project> project;

	public Employee() {
		this.id = 9;
		this.name = "John";
	}
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	   
	public String toString() {
		return "'id: ''" + this.id + "', 'name: ''" + this.name + "'";
	}
	
	
	
	}
