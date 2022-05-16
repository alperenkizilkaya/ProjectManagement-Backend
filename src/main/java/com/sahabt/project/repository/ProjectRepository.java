package com.sahabt.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sahabt.project.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
