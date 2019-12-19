package com.iris.services;

import java.util.List;

import com.iris.models.Operator;
import com.iris.models.Employee;
import com.iris.models.Project;

public interface OperatorService {

	List<Employee> getAllEmployee();

	boolean setAttandance(Operator dataObj);

	List<Project> getAllProject();

}
