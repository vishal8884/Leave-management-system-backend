package io.vishal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.vishal.model.Employee;
import io.vishal.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/leave-management-system")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping("/addEmployee")
	public ResponseEntity<List<Employee>> addEmployee(@RequestBody List<Employee> employee){
		
		for(Employee e : employee) {
			employeeRepository.save(e);
		}
		
		return ResponseEntity.ok(employee);
	}
}
