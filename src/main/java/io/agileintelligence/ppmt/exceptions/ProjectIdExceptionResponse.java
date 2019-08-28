package io.agileintelligence.ppmt.exceptions;

public class ProjectIdExceptionResponse {
	
	private String projectIdentifier;
	
	ProjectIdExceptionResponse(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}
	
}
