package io.agileintelligence.ppmt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.agileintelligence.ppmt.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

	Project save(Project project);
	
}
