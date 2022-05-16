package com.sahabt.project.dto.response;

import com.sahabt.project.entity.Employee;
import com.sahabt.project.entity.EmployeeStatus;
import com.sahabt.project.entity.Project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

public class ProjectEmployeeResponse {

	private Long id;
	private EmployeeStatus employeeStatus;
	private Project project;
	private Employee employee;

	public ProjectEmployeeResponse() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EmployeeStatus getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(EmployeeStatus employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ProjectEmployeeResponse that = (ProjectEmployeeResponse) o;
		return Objects.equals(id, that.id) && employeeStatus == that.employeeStatus && Objects.equals(project, that.project) && Objects.equals(employee, that.employee);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, employeeStatus, project, employee);
	}

	@Override
	public String toString() {
		return "ProjectEmployeeResponse{" +
				"id=" + id +
				", employeeStatus=" + employeeStatus +
				", project=" + project +
				", employee=" + employee +
				'}';
	}
}
