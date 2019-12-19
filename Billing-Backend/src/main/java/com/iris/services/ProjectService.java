package com.iris.services;

import java.util.List;

import com.iris.models.Project;
import com.iris.models.ProjectAllocation;
import com.iris.models.ProjectConfiguration;

public interface ProjectService {
	List<Project> getAllProject();
	List<ProjectConfiguration> getAllProjectConfig();
	public Project getProjectById(int pId);
     public boolean setProjectConfig(ProjectConfiguration pObj1);
     public List<ProjectConfiguration> validateProject(int projectId,int roleId,String location) ;
     public boolean setProjectAllocation(ProjectAllocation projectAllocation);
	
    }
