package com.sahabt.project.service;

import java.util.List;

import com.sahabt.project.dto.request.ProjectRequest;
import com.sahabt.project.dto.response.ProjectResponse;

public interface ProjectService {

	ProjectResponse add(ProjectRequest project);
	ProjectResponse update(Long id,ProjectRequest project);
	ProjectResponse delete(Long id);
	ProjectResponse getById(Long id);
	List<ProjectResponse> getAll();
}
