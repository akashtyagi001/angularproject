package com.iris.services;

import java.util.List;

import com.iris.models.Employee;
import com.iris.models.Operator;
import com.iris.models.Project;
import com.iris.models.ProjectAllocation;
import com.iris.models.ProjectConfiguration;
import com.iris.models.Role;

public interface AdminService {
  List<Project> getAllProject();
  List<Role> getAllRole();
  List<Employee> getAllEmployee();
  List<ProjectConfiguration> getAllProjectConfig();
  Project getProjectById(int pId);
  boolean setProjectConfig(ProjectConfiguration pObj1);
  Operator getBill(int employeeId, String month,int year);
  double getBill(double perHourBilling,Operator deo);
  List<ProjectAllocation> getAllAllocate();
  public ProjectAllocation getConfig(int id);
  public String getEmployeeById1(int id);
  public List<Operator> getAllAttendance();
  String getProjectName(int id);
  
}
