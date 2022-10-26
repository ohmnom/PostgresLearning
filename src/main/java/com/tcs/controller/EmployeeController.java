package com.tcs.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.Employee;
import com.tcs.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/bulkcreate")
	public String bulkcreate(){
		
		
		
		employeeService.saveAll( new Employee("Pooja", "lalitpur", "SE", "A1", new BigDecimal("50000"), true),
		new Employee("Pooja", "lalitpur", "SE", "A1", new BigDecimal("50000"), true),
		new Employee("Pooja", "lalitpur", "SE", "A1", new BigDecimal("50000"), true),
		new Employee("Pooja", "lalitpur", "SE", "A1", new BigDecimal("50000"), true));
		
		return "Table Created";

		/*
		 * repository.saveAll(Arrays.asList(new Customer("Salim", "Khan") , new
		 * Customer("Rajesh", "Parihar") , new Customer("Rahul", "Dravid") , new
		 * Customer("Dharmendra", "Bhojwani")));
		 * 
		 * return "Customers are created";
		 */
	}

}
