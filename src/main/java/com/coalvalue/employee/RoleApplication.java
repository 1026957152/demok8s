package com.coalvalue.employee;

import com.coalvalue.employee.domain.UserInfo;
import com.coalvalue.employee.domain.entity.Employee;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.repository.EmployeeRepository;
import com.coalvalue.employee.repository.UserRepository;
import com.coalvalue.employee.service.EmployeeService;
import com.coalvalue.employee.service.PermissionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Set;

@SpringBootApplication
public class RoleApplication {

	@Autowired
	public EmployeeService employeeService;

	@Autowired
	public UserRepository userRepository;
	@Autowired
	public PermissionService permissionService;


	@Autowired
	public EmployeeRepository employeeRepository;

	public static final String no_service = "no-service";
	public static void main(String[] args) {
		SpringApplication.run(RoleApplication.class, args);
	}



}
