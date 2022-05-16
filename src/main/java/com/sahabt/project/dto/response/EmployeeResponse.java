package com.sahabt.project.dto.response;

import com.sahabt.project.entity.EmployeeStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {

	private Long id;
	private String name;
}
