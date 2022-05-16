package com.sahabt.project.dto.request;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ProjectRequest {
	private String projectName;
	private String description;
	private boolean isActive;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate startDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate endDate;
	private String offer;

	public ProjectRequest() {
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean active) {
		isActive = active;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ProjectRequest that = (ProjectRequest) o;
		return isActive == that.isActive && Objects.equals(projectName, that.projectName) && Objects.equals(description, that.description) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate) && Objects.equals(offer, that.offer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(projectName, description, isActive, startDate, endDate, offer);
	}

	@Override
	public String toString() {
		return "ProjectRequest{" +
				"projectName='" + projectName + '\'' +
				", description='" + description + '\'' +
				", isActive=" + isActive +
				", startDate=" + startDate +
				", endDate=" + endDate +
				", offer='" + offer + '\'' +
				'}';
	}
}
