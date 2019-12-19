package com.iris.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iris.daos.EmployeeDao;
import com.iris.daos.ProjectDao;
import com.iris.daos.RoleDao;
import com.iris.models.Employee;
import com.iris.models.Operator;
import com.iris.models.Project;
import com.iris.models.ProjectAllocation;
import com.iris.models.ProjectConfiguration;
import com.iris.models.Role;
import com.iris.services.AdminService;
@Component
@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {

	
	 @Autowired
	 private ProjectDao projectDao;
	 @Autowired
	 private RoleDao roleDao;
	 @Autowired
	 private EmployeeDao employeeDao;
	 
	 
	public List<Project> getAllProject() {
		return projectDao.getAllProject();
	}

	public List<Role> getAllRole() {
		
		return roleDao.getAllRole();
	}

	public List<Employee> getAllEmployee() {
				return employeeDao.getAllEmployee();
	}

	public List<ProjectConfiguration> getAllProjectConfig() {
		return projectDao.getAllProjectConfig();
	}
	public Project getProjectById(int pId) {
		
		return projectDao.getProjectById(pId);
	}


	public boolean setProjectConfig(ProjectConfiguration pObj1) {
		 
 {

			boolean save = projectDao.setProjectConfig(pObj1);

			return save;

		}
	

}

	public Operator getBill(int employeeId, String month, int year) {
		return employeeDao.getBill(employeeId, month,year);
	}

	public double getBill(double perHourBilling, Operator deo) {
		double halfDay=deo.getHalfDay()*4.5;

		double fullDay=deo.getFullDay()*9;

		double bill=((halfDay*perHourBilling)+(fullDay*perHourBilling));

		return bill;
	}

	public List<ProjectAllocation> getAllAllocate() {
		return employeeDao.getAllAllocate();
	}

	public ProjectAllocation getConfig(int id) {
		return employeeDao.getConfig(id);
	}

	public String getEmployeeById1(int id) {
		return employeeDao.getEmployeeById1(id);
	}

	public List<Operator> getAllAttendance() {
		return employeeDao.getAllAttendance();
	}

	public String getProjectName(int id) {
		Project p = projectDao.getProjectById(id);

		System.out.println(p);

		String name = p.getProjectName();

		return name;

	

}


	}
