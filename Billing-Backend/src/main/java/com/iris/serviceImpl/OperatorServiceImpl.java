package com.iris.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iris.models.Operator;
import com.iris.models.Employee;
import com.iris.models.Project;
import com.iris.daos.EmployeeDao;
import com.iris.daos.ProjectDao;
import com.iris.daos.RoleDao;
import com.iris.services.OperatorService;

@Component
@Service("operatorService")
@Transactional
public class OperatorServiceImpl implements OperatorService{


@Autowired 
private ProjectDao projectsDao;



@Autowired 
private RoleDao roleDao;

@Autowired
private EmployeeDao employeeDao;

public List<Employee> getAllEmployee() {

	return employeeDao.getAllEmployee();

}



public boolean setAttandance(Operator dataObj) {

	return employeeDao.setAttandance(dataObj);
}



public List<Project> getAllProject() {

	return projectsDao.getAllProject();

}



}