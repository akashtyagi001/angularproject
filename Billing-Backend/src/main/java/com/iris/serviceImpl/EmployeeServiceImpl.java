package com.iris.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iris.daos.EmployeeDao;
import com.iris.models.Operator;
import com.iris.models.Employee;
import com.iris.services.EmployeeService;

@Component
@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {


	@Autowired
   private EmployeeDao EmployeeDaoObj;
	
	
	public List<Employee> getAllEmployee() {
		
		return EmployeeDaoObj.getAllEmployee();
	}


	public List<Employee> EmployeeAllocation(int empId) {
		return EmployeeDaoObj.EmployeeAllocation(empId) ;
	}


	public Employee getEmployeeById(int id) {
		return EmployeeDaoObj.getEmployeeById(id);
	}


	public boolean setAttandance(Operator obj) {
		return EmployeeDaoObj.setAttandance(obj);

		
	}


	public Operator getBill(Integer id, String month, String year) {
		// TODO Auto-generated method stub
		return null;
	}

}













