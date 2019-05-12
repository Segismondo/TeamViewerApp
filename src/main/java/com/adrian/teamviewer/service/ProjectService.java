package com.adrian.teamviewer.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.adrian.teamviewer.entity.Project;
import com.adrian.teamviewer.repository.ProjectRepository;

@Service
public class ProjectService {
	
	ProjectRepository projectRepository;
	public ProjectService(ProjectRepository projectRepository) {

			    this.projectRepository = projectRepository;
	}
	public List<Project> findAll(){
			return projectRepository.findAll();
	
	
	}
	
}

