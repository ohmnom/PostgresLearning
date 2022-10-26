package com.tcs.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.Employee;
import com.tcs.repsitory.EmployeeDao;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public void saveAll(Employee employee, Employee employee2, Employee employee3, Employee employee4) {
		
		dao.saveAll(Arrays.asList(employee, employee2,employee3,employee4));
		
	}

}
