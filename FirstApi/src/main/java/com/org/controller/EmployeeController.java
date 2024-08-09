package com.org.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.org.model.Employee;
import com.org.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
 
	
	@Autowired
	private EmployeeService ser;
	
	@GetMapping
	public List<Employee> getAllEmployee()
	{
		return ser.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id)
	{
		Optional<Employee> employee  = ser.getEmployeeById(id);
		return employee.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Employee createEmployees(@RequestBody Employee employees)
    {
	return ser.saveEmployee(employees);
    }
	
	
	
	@DeleteMapping
	public void deleteEmployees(@PathVariable Long id)
    {
	  ser.deleteEmployee(id);
    }
}

