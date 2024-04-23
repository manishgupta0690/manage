package com.project.employee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/employee"})
public class EmployeeController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "Hello";
	}

}
