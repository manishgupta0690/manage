package com.project.employee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.manage.service.EmployeeService;
import com.project.employee.model.Employee;

@RestController
@RequestMapping({ "/api/employee" })
public class EmployeeController {

	
	  @Autowired 
	  private EmployeeService<Employee> employeeService;
	 

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "Hello";
	}

	public static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@RequestMapping(value = { "/save" }, method = { RequestMethod.POST })
	public void saveEmpoyee(@RequestBody Employee emp) {
		log.debug("ENTRY: saveEmpoyee controller");
		 employeeService.save(emp);
	}

	
	  @RequestMapping(value = {"/get-employee"}, method = {RequestMethod.GET})
	  public List<Employee> getEmployee() { 
		  log.debug("ENTRY: saveEmpoyee controller");
		  return employeeService.getEmployeeList();
	  
	   }
	 

}
