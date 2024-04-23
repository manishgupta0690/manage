package com.project.employee.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.project.employee.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
