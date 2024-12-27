package com.cts.jsedemo.utils;

import java.util.Comparator;

import com.cts.jsedemo.models.Employee;

public class CompareEmployeeOnName implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getFullName().compareTo(o2.getFullName());
	}

}
