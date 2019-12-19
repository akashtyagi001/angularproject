package com.iris.daos;

import java.util.List;

import com.iris.models.Project;
import com.iris.models.ProjectAllocation;
import com.iris.models.ProjectConfiguration;

public interface ProjectDao {
	List<Project> getAllProject();
	

	public Project getProjectById(int pId);	
	
	
	List<ProjectConfiguration> getAllProjectConfig();  
	
     public List<ProjectConfiguration> validateProject(int projectId,int roleId,String location) ;
     
     
    public boolean setProjectAllocation(ProjectAllocation projectAllocation);
     
     
     public List<ProjectConfiguration> getAllProjectConfiguration(int projectId); 
     
     public List<ProjectAllocation> getAllProjectAllocation();

public boolean setProjectConfig(ProjectConfiguration pObj1);


public List<ProjectConfiguration> getAllConfigId(int id);
}