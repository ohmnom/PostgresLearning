package com.tcs.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

//	void saveAll(Employee employee, Employee employee2, Employee employee3, Employee employee4);

	

	
}
