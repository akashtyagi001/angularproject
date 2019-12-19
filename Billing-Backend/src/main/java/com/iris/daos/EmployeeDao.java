package com.iris.daos;

import java.util.List;

import com.iris.models.Operator;
import com.iris.models.ProjectAllocation;
import com.iris.models.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployee();
	public List <Employee> EmployeeAllocation(int empId);
	public Employee getEmployeeById(int id);
	public boolean setAttandance(Operator obj);	
	public ProjectAllocation getProAllocationObj(int id);
	public Operator getBill(Integer id,String month,int year);
	public List<Operator> getAllAttendance();	
	public String getEmployeeById1(int id);
	public ProjectAllocation getConfig(int id);
	public List<ProjectAllocation> getAllAllocate();
	
}


