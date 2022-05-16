package com.sahabt.project.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="projects")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String projectName;
	private String description;
	private boolean isActive;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate startDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate endDate;
	private String offer;
	@JsonIgnore
	@OneToMany(mappedBy="project")
	List<ProjectEmployee> projectEmployee;
	@ManyToOne
	private Customer customer;
}
