package com.cts.jsedemo.utils;

import java.util.Comparator;

import com.cts.jsedemo.models.Employee;
import com.cts.jsedemo.models.Manager;

public class CompareEmployeeOnTA implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {

		Double ta1 = o1 instanceof Manager ? ((Manager)o1).getTa() : 0.0;
		Double ta2 = o2 instanceof Manager ? ((Manager)o2).getTa() : 0.0;
		
		return ta1.compareTo(ta2);
	}

}
