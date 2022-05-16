package com.sahabt.project.dto.request;

import com.sahabt.project.entity.Employee;
import com.sahabt.project.entity.EmployeeStatus;
import com.sahabt.project.entity.Project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectEmployeeRequest {

	private EmployeeStatus employeeStatus;
	private Project project;
	private Employee employee;
}
