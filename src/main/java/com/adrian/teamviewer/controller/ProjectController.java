package com.adrian.teamviewer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.teamviewer.entity.Project;
import com.adrian.teamviewer.service.ProjectService;

@RestController
public class ProjectController {
	@Autowired
	ProjectService projectService;
	@GetMapping
	@RequestMapping("/projects")
	List<Project> getProjectsList(){
		return projectService.findAll();
	}
	
	
	
	
}