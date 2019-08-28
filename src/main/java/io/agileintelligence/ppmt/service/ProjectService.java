package io.agileintelligence.ppmt.service;

import io.agileintelligence.ppmt.domain.Project;
import io.agileintelligence.ppmt.exceptions.ProjectIdException;
import io.agileintelligence.ppmt.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveProject(Project project){
    	try {
    		project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
    		return projectRepository.save(project);
    	}catch(Exception e) {
    		throw new ProjectIdException("Project ID "+project.getProjectIdentifier().toUpperCase()+" already exists");
    	}
    }

    
    public Project findProjectByIdentifier(String projectId) {
    	Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase()); 
    	
    	if(project == null) {
    		throw new ProjectIdException("Project ID " + projectId + " doesn't exists.");
    	}
    	
    	return project;
    }
}
