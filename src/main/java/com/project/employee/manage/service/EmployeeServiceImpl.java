package com.project.employee.manage.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.employee.model.Employee;
import com.project.employee.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService<Employee> {

	@Autowired
	private EmployeeRepository repository;

	public static final Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	public void save(Employee employee) {
		log.debug("Entry: save method");
		try {
			repository.save(employee);
		} catch (Exception e) {
			log.error("Error while saving Employee");
		}
	}

	@Override
	public List<Employee> getEmployeeList() {
		return repository.findAll();

	}

}
