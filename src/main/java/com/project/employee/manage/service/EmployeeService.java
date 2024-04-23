package com.project.employee.manage.service;

import java.util.List;

import com.project.employee.model.Employee;

public interface EmployeeService<T> {
	void save(T paramT);
	List<Employee> getEmployeeList();

}

