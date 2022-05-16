package com.sahabt.project.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

public class EmployeeRequest {
	
	private String name;
	private double salary;

	public EmployeeRequest() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EmployeeRequest that = (EmployeeRequest) o;
		return Double.compare(that.salary, salary) == 0 && Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}

	@Override
	public String toString() {
		return "EmployeeRequest{" +
				"name='" + name + '\'' +
				", salary=" + salary +
				'}';
	}
}
