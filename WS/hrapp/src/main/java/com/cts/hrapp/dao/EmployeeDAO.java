package com.cts.hrapp.dao;

import java.util.List;

import com.cts.hrapp.exceptions.DatabaseException;
import com.cts.hrapp.model.Employee;

public interface EmployeeDAO {
	Employee add(Employee emp) throws DatabaseException ;
	List<Employee> getAll() throws DatabaseException ;
	Employee getEmployeeById(int empId) throws DatabaseException ;
	void deleteById(int empId) throws DatabaseException ;
}
