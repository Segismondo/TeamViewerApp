package com.adrian.teamviewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adrian.teamviewer.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}