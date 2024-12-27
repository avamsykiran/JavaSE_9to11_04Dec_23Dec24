package com.cts.hrapp.service;

import java.util.List;

import com.cts.hrapp.dao.EmployeeDAO;
import com.cts.hrapp.dao.EmployeeDaoImpl;
import com.cts.hrapp.exceptions.DatabaseException;
import com.cts.hrapp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO dao;
	
	public EmployeeServiceImpl() {
		this.dao=new EmployeeDaoImpl();
	}
	
	@Override
	public Employee add(Employee emp) throws DatabaseException {
		if(emp!=null) {
			//validate the employee details
			//and if valid
			emp = dao.add(emp);
		}
		return emp;
	}

	@Override
	public List<Employee> getAll() throws DatabaseException {
		return dao.getAll();
	}

	@Override
	public Employee getEmployeeById(int empId) throws DatabaseException {
		return dao.getEmployeeById(empId);
	}

	@Override
	public void deleteById(int empId) throws DatabaseException {
		dao.deleteById(empId);
	}

}
