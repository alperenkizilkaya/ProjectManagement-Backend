package com.sahabt.project.dto.request;

import com.sahabt.project.entity.Employee;
import com.sahabt.project.entity.EmployeeStatus;
import com.sahabt.project.entity.Project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

public class ProjectEmployeeRequest {

	private EmployeeStatus employeeStatus;
	private Project project;
	private Employee employee;

	public ProjectEmployeeRequest() {
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
		ProjectEmployeeRequest that = (ProjectEmployeeRequest) o;
		return employeeStatus == that.employeeStatus && Objects.equals(project, that.project) && Objects.equals(employee, that.employee);
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeStatus, project, employee);
	}

	@Override
	public String toString() {
		return "ProjectEmployeeRequest{" +
				"employeeStatus=" + employeeStatus +
				", project=" + project +
				", employee=" + employee +
				'}';
	}
}
